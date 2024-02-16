import java.util.Scanner;

public class NamedPointTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NamedPoint[] points = new NamedPoint[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter name for point " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter x-coordinate " + (i + 1) + ": ");
            double x = scanner.nextDouble();
            System.out.print("Enter y-coordinate " + (i + 1) + ": ");
            double y = scanner.nextDouble();
            scanner.nextLine();

            points[i] = new NamedPoint(x, y, name);
        }


        System.out.println("\nAll Points:");
        for (NamedPoint point : points) {
            System.out.println(point.getName() + ": (" + point.x + ", " + point.y + ")");
        }

        double shortestDistance = Double.MAX_VALUE;
        NamedPoint closestPoint1 = null;
        NamedPoint closestPoint2 = null;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = points[i].distance(points[j]);
                if (distance < shortestDistance) {
                    shortestDistance = distance;
                    closestPoint1 = points[i];
                    closestPoint2 = points[j];
                }
            }
        }

        System.out.println("The shortest distance of two points are " + closestPoint1.getName() + " and " + closestPoint2.getName() + "and their distance is " + shortestDistance);



        scanner.close();
    }
}
