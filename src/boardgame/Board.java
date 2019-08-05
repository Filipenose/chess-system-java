package boardgame;

public class Board {
	
	private int rows;
	private int columms;
	private Piece[][] pieces;
	
	public Board(int rows, int columms) {
		if (rows < 1 || columms < 1) {
			throw new BoardException(" Error creating board: there must be at leats 1 row and 1 collum.  ");
		}
		this.rows = rows;
		this.columms = columms;
		pieces = new Piece[rows][columms];
		
	}

	public int getRows() {
		return rows;
	}

	
	public int getColumms() {
		return columms;
		
	}

	
	public Piece piece(int row, int collum) {
		if(!positionExists(row, collum)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][collum];
		
	}
	
	public Piece piece(Position position) {
		if(!posistionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getCollum()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position );
		}
		pieces[position.getRow()][position.getCollum()] = piece;
		piece.position = position;
		
	}
	
	private boolean positionExists(int row, int collum) {
		return row >= 0 && row < rows && collum >= 0 && collum < columms;
	}
	
	public boolean posistionExists(Position position) {
		return positionExists(position.getRow(), position.getCollum());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!posistionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
	
	}
