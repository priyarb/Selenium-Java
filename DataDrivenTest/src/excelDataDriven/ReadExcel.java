package excelDataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ReadExcel {

	public static void main(String[] args) throws Exception {

		File file= new File("C:\\Users\\sweet home\\Downloads\\Test.xls");
		
		FileInputStream input = new FileInputStream(file);
		HSSFWorkbook book = new HSSFWorkbook(input);
		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(2);
		String Value = cell.getStringCellValue();
		System.out.println(Value);
		book.close();
		input.close();
	}

}
