package com_gmail_kr_maluar;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public static double calculateSide(Point a,Point b){
        return Math.sqrt(((a.getY() - b.getY()) * (a.getY() - b.getY()))
                + ((a.getX() - b.getX()) * (a.getX() - b.getX())));

    }
}
