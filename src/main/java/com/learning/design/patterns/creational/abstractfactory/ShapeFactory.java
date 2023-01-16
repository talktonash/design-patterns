package com.learning.design.patterns.creational.abstractfactory;

import com.learning.design.patterns.creational.factory.Rectangle;
import com.learning.design.patterns.creational.factory.Shape;
import com.learning.design.patterns.creational.factory.Square;

public class ShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
         if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
