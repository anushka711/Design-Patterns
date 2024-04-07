package com.example.design.pattern.pattern.visitorpattern.visitor.impl;

import com.example.design.pattern.pattern.visitorpattern.dto.Book;
import com.example.design.pattern.pattern.visitorpattern.dto.Fruit;
import com.example.design.pattern.pattern.visitorpattern.visitor.ShoppingCartVisitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public double visit(Book book) {
        return book.getPrice();
    }

    @Override
    public double visit(Fruit fruit) {
        return fruit.getPriceperkg();
    }

}
