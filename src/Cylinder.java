public class Cylinder {
    private int length;
    private int height;
    private int radius;

    public Cylinder() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public Cylinder(int length, int width, int height, int radius) {
        this.length = length;
        this.height = height;
        this.radius = radius;
    }

    public void area(  int height, int radius){
        setHeight(height);

        setRadius(radius);
        System.out.println("Cylinder area: " + (2*Math.PI * radius*( height + radius)));
    }
    public void volume(int height, int radius){
        setHeight(height);
        setRadius(radius);
        double result=(Math.PI*radius*radius*height);
        System.out.println("Cylinder volume:   " + result);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "length=" + length +
                " height=" + height +
                " radius=" + radius +
                '}';
    }
}
