package com.example.design.pattern.pattern.visitorpattern.visitor;

import com.example.design.pattern.pattern.visitorpattern.dto.Book;
import com.example.design.pattern.pattern.visitorpattern.dto.Fruit;

public interface ShoppingCartVisitor {
    public double visit(Book book);

    public double visit(Fruit fruit);
}
