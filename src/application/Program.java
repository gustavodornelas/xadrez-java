package application;

import Boardgame.Board;
import Boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		Ui.printBoard(chessMatch.getPieces());

	}

}
