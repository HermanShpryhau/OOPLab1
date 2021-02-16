package by.bsuir.oop.labs.first.factories.shapes;

import by.bsuir.oop.labs.first.shapes.Rectangle;
import javafx.geometry.Point2D;

public class RectangleFactory extends AbstractShapeFactory {

    @Override
    public Rectangle createShape(Point2D startPoint) {
        return new Rectangle(startPoint, 0, 0);
    }
}
