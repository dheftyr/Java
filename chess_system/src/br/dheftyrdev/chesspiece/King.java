package br.dheftyrdev.chesspiece;

import br.dheftyrdev.boargame.Board;
import br.dheftyrdev.chess.ChessPiece;
import br.dheftyrdev.chess.Color;

public class King extends ChessPiece {
    
    public King(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
    
}
