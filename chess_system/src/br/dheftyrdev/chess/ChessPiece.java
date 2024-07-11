package br.dheftyrdev.chess;

import br.dheftyrdev.boargame.Piece;
import br.dheftyrdev.boargame.Board;

public class ChessPiece extends Piece {
    private Color color;


    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }

    public Color getColor(){
        return color;
    }
    
}
