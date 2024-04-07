package com.example.design.pattern.pattern.singletonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.design.pattern.pattern.singletonPattern.patterns.BillPughSingleton;
import com.example.design.pattern.pattern.singletonPattern.patterns.EagerSingleton;
import com.example.design.pattern.pattern.singletonPattern.patterns.LazySingleton;
import com.example.design.pattern.pattern.singletonPattern.patterns.StaticBlockSingleton;

public class Test {

    public static void main(String args[]) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        if (eagerSingleton1.hashCode() == eagerSingleton2.hashCode()) {
            System.out.println("Eager singleton works");
        }

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        if (lazySingleton1.hashCode() == lazySingleton2.hashCode()) {
            System.out.println("LazySingleton works");
        }

        ExecutorService executorService = null;
        MyThread myThread = new MyThread();
        try {
            executorService = Executors.newFixedThreadPool(5);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (executorService != null)
                executorService.shutdown();
        }

        StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockSingleton2 = StaticBlockSingleton.getInstance();
        if (staticBlockSingleton1.hashCode() == staticBlockSingleton2.hashCode()) {
            System.out.println("StaticBlockSingleton works");
        }

        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
        if (billPughSingleton1.hashCode() == billPughSingleton2.hashCode()) {
            System.out.println("BillPughSingleton works");
        }

    }

}
