package chess;

import boardgame.Position;

public class ChessPosition {
	private int row;
	private char column;
	
	public ChessPosition(int row, char column) {
		if (row < 1 || row > 8 || column < 'a' || column > 'h') {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.row = row;
		this.column = column;
	}
	
	public int getRow() {
		return row;
	}
	
	public char getColumn() {
		return column;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position){
		return new ChessPosition(8 - position.getRow(), (char)('a' - position.getColumn()));
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	
}
