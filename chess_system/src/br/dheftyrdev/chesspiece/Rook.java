package br.dheftyrdev.chesspiece;

import br.dheftyrdev.boargame.Board;
import br.dheftyrdev.chess.ChessPiece;
import br.dheftyrdev.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color){
        super(board, color);
    };

    @Override
    public String toString(){
        return "R";
    }
}
