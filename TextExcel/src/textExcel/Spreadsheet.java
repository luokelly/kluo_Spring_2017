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
		System.out.print(this.getGridText());
	}
	public String processCommand(String command)
	{
		if(command.equals("")){ //return value of cell
			return command;
		}
		
		if(command.toUpperCase().equals("CLEAR")){ //clear entire sheet and return entire sheet grid
			for(int i = 0; i < cells.length; i++){
				for(int j = 0; j<cells[i].length; j++){
					cells[i][j] = new EmptyCell();
				}
				return this.getGridText();
			}
		}
		
		if(command.contains("=")){
			String[] str = command.split(" "); //split command
			String first = str[3];
			int colNum = command.charAt(0) - 'A';
			if(str[1].length() > 2){
				cells[colNum][rowNum] = first;
			}else{
				int rowNum = command.charAt(1);
			}
			
			
			
			
		}
		//assign string and return String of entire sheet grid
		
		if(command.length() > 5 && command.contains("clear")){
			int colNum = command.charAt(0) - 'A';
			int rowNum
		}//clear a written cell and return entire sheet grid
		
		return command;
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
		return cells[loc.getRow()][loc.getCol()];
	}

	@Override
	public String getGridText() // return entire sheet grid
	{
		String header = "   ";
		for (char i = 'A'; i <= 'L'; i++){
			header += "|" + i + "         ";	
		}
		header += "|";
		
		String whole = "\n";
		
		for (int j = 0; j < this.getRows(); j++ ){
			whole += ((j+1) + "   ").substring(0, 3);
			whole += "|";
			for (int k = 0; k < this.getCols(); k++){
				whole += cells[j][k].abbreviatedCellText() + "|";
			}			
			whole += "\n";
		}
		return header + whole;
	}

}
