package com_gmail_kr_maluar;

public class Main {
    public static void main(String[] args) {
        Point one = new Point(0, 0);
        Point two = new Point(0, 3);
        Point three = new Point(5, 3);
        Point four = new Point(5, 0);
        Point five = new Point(5, 5);
        Point six = new Point(0, 5);
        Board board = new Board();

        Triangl triangl = new Triangl(one, two, three);
        triangl.perimeter();
        triangl.area();

        Circle circle = new Circle(one, three);
        circle.perimeter();
        circle.area();

        Square square = new Square(one, two, three, four);
        square.perimeter();
        square.area();

        square = new Square(one, four, five, six);
        square.perimeter();
        square.area();

        board.putInCell(triangl,1);
        board.putInCell(circle,2);
        board.removeInCell(1);
        board.putInCell(square,1);
        board.putInCell(triangl,0);

        board.information();

    }
}
