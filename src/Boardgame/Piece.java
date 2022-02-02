package Boardgame;

public class Piece {
	
	protected Position position;
	private Board board;

	//Constructors
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}
	
	
	//Getters and Setters
	protected Board getBoard() {
		return board;
	}
	
}
