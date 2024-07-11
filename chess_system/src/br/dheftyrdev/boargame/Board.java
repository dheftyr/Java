package br.dheftyrdev.boargame;

public class Board {
    private int rows;
    private int column;
    private Piece pieces[][];

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

    public Piece piece(int row, int column){
        return pieces[row][column];
    }

    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }


}
