package com.learning.design.patterns.creational.singleton;

public class BillPughSingletonPattern {
    private BillPughSingletonPattern() {  }

    private static class BillPughSingletonHelper{
        private static final BillPughSingletonPattern INSTANCE = new BillPughSingletonPattern();
    }

    public static BillPughSingletonPattern getInstance(){
        return BillPughSingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        // Get Bill Pugh instance and test check hashcode of the object.
        BillPughSingletonPattern instance1 = BillPughSingletonPattern.getInstance();
        System.out.println("Object hashcode for thread safe and with Bill Pugh singleton class:" + instance1);

        BillPughSingletonPattern instance2 = BillPughSingletonPattern.getInstance();
        System.out.println("Object hashcode for thread safe and with Bill Pugh singleton class:" + instance2);
    }

}
