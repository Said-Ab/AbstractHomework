public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4, 5);
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(4);
        Shape circle = new Circle(3);
        Shape pentagon = new Pentagon(5);

        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Pentagon perimeter: " + pentagon.getPerimeter());
    }
}

