public class ClassDemo {
    public static void main(String[] args) {
        // Create Object shape 1
        Shape shape1 = new Shape(10, 20);
        // Create Object Shape 2 without reference
        Shape shape2;

        
        // Display Shape 1
        System.out.println("Shape 1");
        shape1.display();

        // Refere Shape 1 to shape2
        shape2 = shape1;

        // Display Shape 2
        System.out.println("Shape 2");
        shape2.display();

        // Modify Value of shape2
        shape2.setWidth(40);
        System.out.println("Shape 1");
        shape1.display();
        System.out.println("Shape 2");
        shape2.display();
    }
}

class Shape {
    private int width;
    private int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void display() {
        System.out.println("Width : " + width + " Height : " + height);
    }
}