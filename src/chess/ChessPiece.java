package chess;

import Boardgame.Board;
import Boardgame.Piece;

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
	
}
