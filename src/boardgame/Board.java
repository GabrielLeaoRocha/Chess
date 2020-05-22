package boardgame;

public class Board {

	private int row;
	private int column;
	private Piece[][] pieces;
	
	//contructors
	public Board(Integer row, Integer column) {
		this.row = row;
		this.column = column;
		pieces = new Piece[row][column];
	}

	//Getters and Setters
	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	//methods
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
}
