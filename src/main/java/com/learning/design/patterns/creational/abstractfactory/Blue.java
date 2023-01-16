package com.learning.design.patterns.creational.abstractfactory;

public class Blue implements Color{
    @Override
    public void getColor(String color) {
        System.out.println("Blue Color");
    }
}
