package com.example.design.pattern.pattern.singletonPattern.patterns;

public class StaticBlockSingleton {

    private static StaticBlockSingleton INSTANCE = null;

    private StaticBlockSingleton() {

    }

    static {
        try {
            if (INSTANCE == null) {
                INSTANCE = new StaticBlockSingleton();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }

}
