package com.example.design.pattern.pattern.singletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.example.design.pattern.pattern.singletonPattern.patterns.SerializationSingleton;

public class TestSerialization {

    public static void main(String args[]) {

        ObjectOutput objectOutput = null;
        SerializationSingleton serializationSingleton1 = SerializationSingleton.getInstance();
        SerializationSingleton serializationSingleton2 = null;
        try {
            objectOutput = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            objectOutput.writeObject(serializationSingleton1);

            objectOutput.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ObjectInput objectInput = null;

        try {
            objectInput = new ObjectInputStream(new FileInputStream("singleton.ser"));

            Object readObject = objectInput.readObject();

            serializationSingleton2 = (SerializationSingleton) readObject;

        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * hascode of original singleton
         * object(singleton1) and serialized
         * object(singleton2) are same
         * so singleton has not broken.
         */
        System.out.println(serializationSingleton1.hashCode());
        System.out.println(serializationSingleton2.hashCode());

    }

}
