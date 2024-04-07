package com.example.design.pattern.pattern.singletonPattern.patterns;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {

    private static SerializationSingleton INSTANCE = null;

    static {
        try {
            if (INSTANCE == null) {
                INSTANCE = new SerializationSingleton();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object readResolve() {
        return INSTANCE;
    }

    public static SerializationSingleton getInstance() {
        return INSTANCE;
    }
}
