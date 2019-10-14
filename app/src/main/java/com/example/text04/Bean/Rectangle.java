package com.example.text04.Bean;

public class Rectangle extends Shape {
    private double m;
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
         this.Area = m*n;
    }

    public Rectangle(double m, double n) {
        this.m = m;
        this.n = n;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

}
