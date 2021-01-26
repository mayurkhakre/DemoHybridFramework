package utilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Expected_ExcelData {
	
	   public static List<String> ExpectedData(String sheetname) throws Exception {
		List<String>exp=new ArrayList<String>();
		FileInputStream fis = new FileInputStream("src/main/java/resources/TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetname);
		int rows = sh.getPhysicalNumberOfRows();
		int columns = sh.getRow(rows - 1).getPhysicalNumberOfCells();
		XSSFCell cell = null;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				cell = sh.getRow(i).getCell(j);
				if (cell.getCellType() == CellType.STRING) {
				exp.add(cell.getStringCellValue()) ;

				} else {
					exp.add(NumberToTextConverter.toText(cell.getNumericCellValue()));

				}
			}
		}
		wb.close();
		return exp;

	}
	   
	   public static String getData( String sheetName, int row , int col) {
			
		   String data=null;
		    try{
		    	
			FileInputStream fis= new FileInputStream("src/main/java/resources/TestData.xlsx");
			
			Workbook wb =WorkbookFactory.create(fis);
			
			
			Sheet sh= wb.getSheet(sheetName);
			
			Cell cell=sh.getRow(row).getCell(col);
			
			data=cell.toString();
			}
		    
		    catch(Exception e) {
		    	e.printStackTrace();
		                 }
		    return data;
			}
	   
	   
	   
	   
	   
	   

}
