package com.company;

public class RightAngledTriangle extends Shape {
    private double base;
    private double height;

    public RightAngledTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double area() {
        return (base * height) / 2;
    }
}
