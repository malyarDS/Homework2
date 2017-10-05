package com_gmail_kr_maluar;


public class Square extends Shape{

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square(Point one, Point two, Point three, Point four) {
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }



    @Override
    double perimeter() {
        double sideOne =Point.calculateSide(a,b);
        double sideTwo = Point.calculateSide(b,c);
        double sideThree = Point.calculateSide(c,d);
        double sideFour = Point.calculateSide(d,a);

        if (sideOne == sideTwo &
                sideTwo == sideThree & sideThree == sideFour){
        return sideOne * 4;
    }else {
            return -1;
        }
    }



    @Override
    double area() {
        if (perimeter()!= -1){
            return Point.calculateSide(a,b)*Point.calculateSide(b,c);
        }
        return -1;
    }
}
