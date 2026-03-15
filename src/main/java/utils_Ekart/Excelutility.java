package utils_Ekart;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility 
{
	 public static Object[][] getExcelData(String path, String sheetName) throws Exception 
	 {

	        FileInputStream fis = new FileInputStream(path);
	        XSSFWorkbook wb = new XSSFWorkbook(fis);
	        XSSFSheet sheet = wb.getSheet(sheetName);

	        int rows = sheet.getLastRowNum();
	        int cols = sheet.getRow(0).getLastCellNum();

	        Object[][] data = new Object[rows][cols];

	        for (int i = 1; i <= rows; i++) 
	        {
	            for (int j = 0; j < cols; j++)
	            {

	                data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
	            }
	        }

	        wb.close();
	        return data;
}
}