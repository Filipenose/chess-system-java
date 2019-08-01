package application;

import chess.Chessmatch;

public class Program {

	public static void main(String[] args) {
		
		Chessmatch chessMatch = new Chessmatch();
		
		UI.printBoard(chessMatch.getPieces());
		
	}

}
