package com.example.design.pattern.pattern.singletonPattern;

import com.example.design.pattern.pattern.singletonPattern.patterns.CloneSingleton;

public class TestClone {
    public static void main(String[] args) {
        CloneSingleton cSingleton1 = CloneSingleton.getInstance();

        try {
            CloneSingleton cSingleton2 = (CloneSingleton) cSingleton1.clone();
            if (cSingleton1.hashCode() == cSingleton2.hashCode()) {
                System.out.println("Clone singleton works");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
