package com.example.design.pattern.pattern.singletonPattern.patterns;

public class BillPughSingleton {

    private BillPughSingleton() {

    }

    public static BillPughSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

}
