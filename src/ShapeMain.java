import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    private List<Shape> shapes = new ArrayList<>();
    public static void main(String[] args) {
        ShapeMain shapeMain = new ShapeMain();
        shapeMain.shapes.add(new Circle(10));
        shapeMain.shapes.add(new Square(10));

        for (Shape shape:shapeMain.shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Circumference: " + shape.getCircumference());

        }
    }
}
