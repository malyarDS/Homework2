package com_gmail_kr_maluar;

import java.util.Arrays;

public class Board {
    private Shape []board = new Shape[4];

    public Board(Shape[] board) {
        this.board = board;
    }

    public Board() {
        super();
    }

    public Shape[] getBoard() {
        return board;
    }

    public void setBoard(Shape[] board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Board{" +
                "board=" + Arrays.toString(board) +
                '}';
    }
    public void putInCell(Shape shape ,int cell){
        if (cell >=0 && cell<board.length){
            if (board[cell] != null){
                System.out.println("\n" +
                        "The cell is busy");
            }else {
                board[cell]=shape;
            }
            }else {
            System.out.println("\n" +
                    "Invalid cell number entered");
        }
    }
    public void removeInCell(int cell){
        if (cell >=0 && cell<board.length && board[cell] !=null ){
            board[cell] = null;
        }else {
            System.out.println("Invalid cell number entered " +
                    "or this cell empty");
        }
    }
    public void information(){
        if (board[0]==null && board[1]==null &&
                board[2]==null && board[3]==null){
            System.out.println("\n" +
                    "The board is empty");
        }else {
            for ( int i=0;i<board.length;i++){
                if (board[i]==null){
                    System.out.println("The cell "+i+"busy figure"+
                    board.toString()+"her perimetr = "+board[i].perimeter()
                            + "and her area = "+board[i].area());
                }

            }
        }
    }
}
