package chess;

import Boardgame.Board;
import Boardgame.Piece;
import Boardgame.Position;

public abstract class ChessPiece extends Piece {
	
	private Color color;

	//Constructors
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Getters and Setters
	public Color getColor() {
		return color;
	}
	
	protected boolean isThereOpponentPiece (Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		
		return p != null && p.getColor() != color; 
	}
	
}
