package com.example.design.pattern.pattern.singletonPattern.patterns;

public class CloneSingleton implements Cloneable {

    private static final CloneSingleton INSTANCE = new CloneSingleton();

    private CloneSingleton() {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return INSTANCE;
    }

    public static CloneSingleton getInstance() {
        return INSTANCE;
    }
}
