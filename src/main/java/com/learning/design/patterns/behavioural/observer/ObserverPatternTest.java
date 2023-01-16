package com.learning.design.patterns.behavioural.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        subject.setState(10);
    }
}
