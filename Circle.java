package com_gmail_kr_maluar;

public class Circle extends Shape{

    private Point a;
    private Point b;

    public Circle(Point a, Point b) {
        super();
        this.a = a;
        this.b = b;
    }

    public Circle() {
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    double area() {
        return Math.PI*Point.calculateSide(a, b)*
                Point.calculateSide(a, b);
    }

    @Override
    double perimeter() {
        return 2*Math.PI*Point.calculateSide(a,b);
    }


}
