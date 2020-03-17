import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Square(10));

        for (Shape shape:shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Circumference: " + shape.getCircumference());

        }
    }
}
