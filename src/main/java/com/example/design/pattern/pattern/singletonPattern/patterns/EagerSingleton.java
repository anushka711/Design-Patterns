package com.example.design.pattern.pattern.singletonPattern.patterns;

public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
