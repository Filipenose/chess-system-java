package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class Chessmatch {
	private Board board;
	
	
	public Chessmatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumms()];
		
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumms(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
			
		}
	
		return mat;
	
	}
	
	private void placeNewPiece(char collum, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(collum, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
		//board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		//board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		//board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
}
