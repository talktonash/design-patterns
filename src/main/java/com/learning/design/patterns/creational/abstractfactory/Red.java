package com.learning.design.patterns.creational.abstractfactory;

public class Red implements Color{
    @Override
    public void getColor(String color) {
        System.out.println("Red Color");
    }
}
