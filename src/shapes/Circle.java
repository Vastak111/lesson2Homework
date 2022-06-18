package shapes;

public class Circle implements Shape {
    @Override
    public double getSquare(Integer firstSide, Integer secondSide) {
        return firstSide*Math.PI;
    }
}
