package br.dheftyrdev.boargame;

public class Board {
    private int rows;
    private int column;
    private Piece pieces[][];

    public Board(){}

    public Board(int rows, int column){
        this.rows = rows;
        this.column = column;
        pieces = new Piece[rows][column];
    }

    public int getRows(){
        return rows;
    }

    public int getColumn(){
        return column;
    }

    public void seRows(int rows){
        this.rows = rows;
    }

    public void setColumn(int column){
        this.column = column;
    }




}
