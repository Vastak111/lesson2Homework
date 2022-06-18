package shapes;

public class Rectangle implements Shape{

    @Override
    public double getSquare(Integer firstSide, Integer secondSide) {
        return firstSide*secondSide;
    }
}
