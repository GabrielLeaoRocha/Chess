package boardgame;

public class Board {

	private int row;
	private int column;
	private Piece[][] pieces;
	
	//contructors
	public Board(Integer row, Integer column) {
		if(row < 1 || column < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.row = row;
		this.column = column;
		pieces = new Piece[row][column];
	}

	//Getters and Setters
	public Integer getRow() {
		return row;
	}

	public Integer getColumn() {
		return column;
	}

	//methods
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Positon not on the board");
		}
		return pieces[row][column];
	}
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Positon not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public boolean positionExists(int row, int column) {
		return row >= 0 && row < this.row && column >= 0 && column < this.column;
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Positon not on the board");
		}
		return piece(position) != null;
	}
}
