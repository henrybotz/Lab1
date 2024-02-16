public class NamedPoint extends Point {
    private String name;

    public NamedPoint(double x, double y, String name) {
        super(x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double distance(NamedPoint other) {
        return super.distance(other);
    }
}
