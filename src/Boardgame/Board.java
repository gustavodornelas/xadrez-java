package Boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece [][] pieces;
	
	//Constructors-
	public Board (int rows, int columns) {
		
		//Validate
		ValidadeNewBoard(rows, columns);
		
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	//Getters and Setters
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	//Methods
	public Piece piece(int row, int column) {
		
		//Validate
		ValidadePositionExists(row, column);
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		
		//Validate
		ValidadePositionExists(position);
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece (Piece piece, Position position) {
		
		//Validate
		ValidadeThereIsAPiece(position);
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		
		//Validate
		ValidadePositionExists(position);
		if (piece(position) == null) {
			return null;
		}
		
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		
		return aux;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		ValidadePositionExists(position);
		return piece(position) != null;
	}
	
	//Exceptions
	public void ValidadePositionExists (Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Positon not on the board!");
		}
	}
	
	public void ValidadePositionExists (int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Positon not on the board!");
		}
	}
	
	public void ValidadeThereIsAPiece(Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position + "!");
		}
	}
	
	public void ValidadeNewBoard(int rows, int columns) {
		if (rows < 1 || columns <1) {
			throw new BoardException("Error creating board: there must be a least 1 row and 1 column!");
		}
	}
}
