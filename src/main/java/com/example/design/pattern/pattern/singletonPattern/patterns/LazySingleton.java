package com.example.design.pattern.pattern.singletonPattern.patterns;

public class LazySingleton {

    private static LazySingleton INSTANCE = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
