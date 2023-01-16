package com.learning.design.patterns.creational.singleton;

//Best and easy approach of all.
public enum EnumSingleton {
    INSTANCE;
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println("Enum instance equality check : " + (enumSingleton1 == enumSingleton2));
    }
}
