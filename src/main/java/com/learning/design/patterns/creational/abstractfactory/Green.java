package com.learning.design.patterns.creational.abstractfactory;

public class Green implements Color{
    @Override
    public void getColor(String color) {
        System.out.println("Green Color");
    }
}
