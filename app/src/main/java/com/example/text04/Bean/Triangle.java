package com.example.text04.Bean;

public class Triangle extends Shape {
    private double bottom;
    private double height;
    private double Area;

    public Triangle(double bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double area) {
        Area = area;
    }

    @Override
    public void calArea() {
        super.calArea();
        this.Area = (height*bottom)/2;
    }
}
