public class Square implements Shape {
    private final double sideLength;

    public Square(double sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength*sideLength;
    }

    @Override
    public double getCircumference() {
        return sideLength*4;
    }
}
