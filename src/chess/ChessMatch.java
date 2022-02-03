package chess;

import Boardgame.Board;
import Boardgame.Piece;
import Boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private int turn;
	private Color currentPlayer;
	private Board board;
	
	
	//Constructors
	public ChessMatch() {
		board = new Board(8, 8);
		turn = 1;
		currentPlayer = Color.WHITE;
		initialSetup();
	}
	
	//Getters and Setters
	public int getTurn() {
		return turn;
	}
	
	public Color getCurrentPlayer() {
		return currentPlayer;
	}
	
	//Methods
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	//Returns possible moves for the piece 
	public boolean[][] possibleMoves(ChessPosition sourcePosition){
		Position position = sourcePosition.toPosition();
		validadeSourcePosition(position);
		return board.piece(position).possibleMoves();
	}
	
	//execute the move
	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition ) {
		Position source = sourcePosition.toPosition();
		Position target = targetPosition.toPosition();
		
		validadeSourcePosition(source);
		validadeTargetPosition(source, target);
		
		Piece capturedPiece = makeMove(source, target);
		nextTurn();
		
		return (ChessPiece)capturedPiece;
	}
	
	
	//Move piece
	private Piece makeMove(Position source, Position target) {
		Piece p = board.removePiece(source);
		Piece capturedPiece = board.removePiece(target);
		board.placePiece(p, target);
		
		return capturedPiece;
	}
	
	//Add piece to the board 
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	//start the board
	private void initialSetup() {
		//Black Pieces
		placeNewPiece('a', 8, new Rook(board, Color.BLACK));
		placeNewPiece('h', 8, new Rook(board, Color.BLACK));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		
		//White Pieces
		placeNewPiece('a', 1, new Rook(board, Color.WHITE));
		placeNewPiece('h', 1, new Rook(board, Color.WHITE));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
	
	//Next Turn
	private void nextTurn() {
		turn++;
		currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;
	}
	
	//Exceptions
	private void validadeSourcePosition(Position position) {
		if (!board.thereIsAPiece(position)) {
			throw new ChessException("There is no piece on source position!");
		}
		
		if (currentPlayer != ( (ChessPiece) board.piece(position)).getColor()) {
			throw new ChessException("The Chosen piece is not yours");
		}
		
		if (!board.piece(position).isThereAnyPossibleMove()) {
			throw new ChessException("There is no possible moves for the chosen piece!");
		}
		
	}
	
	private void validadeTargetPosition(Position source, Position target) {
		
		if (!board.piece(source).possibleMove(target)) {
			throw new ChessException("The chosen piece can't move to target position!");
		}
		
	}

}
