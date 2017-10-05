package com_gmail_kr_maluar;

import static java.lang.System.*;

public class Triangl extends Shape {

    private Point a;
    private Point b;
    private Point c;

    public Triangl(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangl() {
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

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangl{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    double perimeter() {
        double per = (Point.calculateSide(a,b)+
                Point.calculateSide(b,c)+
                Point.calculateSide(c,a));
        return per;
    }

    @Override
    double area() {
        double p = perimeter()/2;
        double s = Math.sqrt(
                p*(p-(Point.calculateSide(a,b)))*
                        (p-(Point.calculateSide(b,c)))*
                        (p-(Point.calculateSide(c,a))));
        return s;
    }
}
