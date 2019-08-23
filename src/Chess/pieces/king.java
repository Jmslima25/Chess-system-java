package Chess.pieces;

import Chess.ChessPiece; 
import Chess.Color;
import boardgame.Board;

public class king  extends ChessPiece{

	public king(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "K";
	}


	@Override
	public boolean[][] possiblesMoves() {
		boolean  [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
	
}
