package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int rows = 20;
	private int cols = 12;
	Cell[][] cells;
	
	public Spreadsheet(){
		cells = new EmptyCell[20][12];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				cells[i][j] = new EmptyCell();
				
			}
		}
	}
	public String processCommand(String command)
	{
		//return value of cell
		//assign string and return String of entire sheet grid
		//clear entire sheet and return entire sheet grid
		//clear a written cell and return entire sheet grid
		
		return command;
	}
	public String cellInspection(String command){
		
	}

	@Override
	public int getRows()
	{
		return rows;
	}
	
	@Override
	
	public int getCols()
	{
		return cols;
	}

	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		// return entire sheet grid
		return null;
	}

}
