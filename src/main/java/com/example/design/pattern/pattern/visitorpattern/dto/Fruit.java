package com.example.design.pattern.pattern.visitorpattern.dto;

import com.example.design.pattern.pattern.visitorpattern.Item;
import com.example.design.pattern.pattern.visitorpattern.visitor.ShoppingCartVisitor;

public class Fruit implements Item {

    private String name;
    private double priceperkg;
    private String colour;

    public Fruit(String name, double priceperkg, String colour) {
        this.name = name;
        this.priceperkg = priceperkg;
        this.colour = colour;
    }

    public Fruit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceperkg() {
        return priceperkg;
    }

    public void setPriceperkg(double priceperkg) {
        this.priceperkg = priceperkg;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
