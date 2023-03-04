public class Parallelepiped {
    private int length;
    private int width;
    private int height;

    public Parallelepiped() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public Parallelepiped(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;

    }
    public void area(int length,int width, int height){
        setHeight(height);
        setLength(length);
        setWidth(width);
        System.out.println( "Parallelepiped area: " + (2*((height * length) + (length * width) + (height * width))));
    }
    public void volume(int length,int width, int height){
        System.out.println("Parallelepiped volume: " + (length*width*height));
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
