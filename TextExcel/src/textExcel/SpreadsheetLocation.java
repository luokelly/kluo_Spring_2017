package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
    
	private int rows;
	private int cols;

    public int getRow()
    {
        return rows-1;
    }

    @Override
    public int getCol()
    {
        
        return cols;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	rows = Integer.parseInt(cellName.substring(1));
    	cols = cellName.charAt(0) - 'A';
   
    }

}
