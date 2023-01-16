package com.learning.design.patterns.creational.factory;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

public class ShapeFactory {

    public Shape getShape(String type){
        if(type ==  null) return null;

        if(type.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }  else{
            return null;
        }
    }

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape rectangle = factory.getShape("RECTANGLE");
        System.out.println("Rectangle instance invoked :");
        rectangle.draw();

        Shape square = factory.getShape("SQUARE");
        System.out.println("square instance invoked :");
        square.draw();

        //Java example for factory
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.systemDefault()));
        System.out.println("Instance equals check for Calender instance  generated from Calendar factory:" + calendar.equals(calendar1));
    }
}
