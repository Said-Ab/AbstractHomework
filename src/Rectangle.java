public class Rectangle extends Shape{

double height;
double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        return (height*2)+(width*2);
    }
}
