package com.example.design.pattern.pattern.visitorpattern;

import com.example.design.pattern.pattern.visitorpattern.visitor.ShoppingCartVisitor;

public interface Item {

    public double accept(ShoppingCartVisitor vistor);
}