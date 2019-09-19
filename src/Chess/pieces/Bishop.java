package Chess.pieces;

import Chess.ChessPiece; 
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class Bishop  extends ChessPiece{

	public Bishop(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		return "B";
	}
	//NW
	public boolean[][] possiblesMoves() {
		boolean  [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0,0);
		
		p.setValues(position.getRow() - 1, position.getColumn()-1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow()-1, p.getColumn()-1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//NE
		
		p.setValues(position.getRow()-1, position.getColumn() + 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow()-1, p.getColumn()+1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//SE
		
		p.setValues(position.getRow()+1, position.getColumn() + 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow()+1, p.getColumn()+1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//SO
		
		p.setValues(position.getRow() +1 , position.getColumn()-1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow()+1, p.getColumn()-1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		
		return mat;
	}
}