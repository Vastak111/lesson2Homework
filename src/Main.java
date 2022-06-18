import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        System.out.println("The square of the circle is " + String.format("%.2f", circle.getSquare(10, 1)));
        System.out.println("The square of the rectangle is " + rectangle.getSquare(10, 5));
    }
}