package com.learning.design.patterns.creational.prototype;

public class ConcretePrototype implements Prototype{

    private int value;
    public ConcretePrototype(int value) {
        super();
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public ConcretePrototype clone() {
        return new ConcretePrototype(value);
    }

    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype(5);
        ConcretePrototype clone = prototype.clone();

        System.out.println("Prototype value :" + prototype.getValue() +" Prototype object  hashcode :" + prototype);
        System.out.println("clone value :" + clone.getValue() +" clone object  hashcode :" + clone);

    }
}
