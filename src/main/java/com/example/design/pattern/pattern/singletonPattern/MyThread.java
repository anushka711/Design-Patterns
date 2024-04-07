package com.example.design.pattern.pattern.singletonPattern;

import com.example.design.pattern.pattern.singletonPattern.patterns.ThreadsafeSingleton;

public class MyThread implements Runnable {

    @Override
    public void run() {
        ThreadsafeSingleton threadsafeSingleton = ThreadsafeSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " + threadsafeSingleton.hashCode());
    }

}
