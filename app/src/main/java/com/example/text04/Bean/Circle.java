package com.example.text04.Bean;

public class Circle extends Shape {

    private double n;
    private double Area;

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    @Override
    public void calArea() {
        super.calArea();
        this.Area = 3.14*n*n;
    }

    public Circle(double n) {
        this.n = n;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }
}

