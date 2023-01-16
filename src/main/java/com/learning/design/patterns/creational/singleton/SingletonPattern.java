package com.learning.design.patterns.creational.singleton;

public class SingletonPattern {
    private static SingletonPattern singletonPattern;

    private SingletonPattern() {
    }

    //Lazy Initialization i.e. get the instance when required by calling getInstance().
    public static SingletonPattern getInstance() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }

    // Thread safe but slow due to synchronization.
    public static synchronized SingletonPattern getThreadSafeInstance() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }

    // Thread safe but litter better than blocking whole method. - Lazy initialization with double check locking
    public static SingletonPattern getThreadSafeDoubleCheckLockInstance() {
        if (singletonPattern == null) {
            //This block removes overhead in multi-thread environment.
            synchronized (SingletonPattern.class){
                if (singletonPattern == null){
                    singletonPattern = new SingletonPattern();
                }
            }

        }
        return singletonPattern;
    }

    //Bill Pugh Singleton creation, no synchronization required.
    private static class BillPughSingleton{
        private static final SingletonPattern INSTANCE = new SingletonPattern();

    }

    public static SingletonPattern getBillPughSingletonInstance() {
        return BillPughSingleton.INSTANCE;
    }


    public static void main(String[] args) {
        // Get one instance and test check hashcode of the object.
        SingletonPattern instance1 = SingletonPattern.getInstance();
        System.out.println("Object hashcode for 1st instance of singleton class:" + instance1);
        // Get second instance and test check hashcode of the object.
        SingletonPattern instance2 = SingletonPattern.getInstance();
        System.out.println("Object hashcode for 2st instance of singleton class:" + instance2);
        // Get thread safe instance and test check hashcode of the object.
        SingletonPattern instance3 = SingletonPattern.getThreadSafeInstance();
        System.out.println("Object hashcode for thread safe singleton class:" + instance3);
        // Get thread safe double lock instance and test check hashcode of the object.
        SingletonPattern instance4 = SingletonPattern.getThreadSafeDoubleCheckLockInstance();
        System.out.println("Object hashcode for thread safe and with double check locking singleton class:" + instance4);


    }

}
