package com.learning.design.patterns.creational.abstractfactory;

import com.learning.design.patterns.creational.factory.Shape;

public interface AbstractFactory {
    Shape getShape(String shape);
    Color getColor(String color);
}

