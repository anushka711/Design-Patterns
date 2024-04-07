package com.example.design.pattern.pattern.singletonPattern.patterns;

public class ThreadsafeSingleton {

    private static ThreadsafeSingleton INSTANCE = null;

    private ThreadsafeSingleton() {

    }

    public static ThreadsafeSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (ThreadsafeSingleton.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new ThreadsafeSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
