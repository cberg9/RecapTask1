package com.company;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double area(){
        return height*width;
    }
}
