package excelDataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

	public static void main(String[] args) throws Exception {

		try {
			String file="C:\\Users\\sweet home\\Downloads\\Test.xls";
			// XSSFWorkbook book = new XSSFWorkbook();

			
			HSSFWorkbook book = new HSSFWorkbook();
			HSSFSheet sheet = book.createSheet("Sample");
			HSSFRow row = sheet.createRow(0);
			
			row.createCell(0).setCellValue("Name");
			row.createCell(1).setCellValue("Age");
			row.createCell(2).setCellValue("Place");
			
			HSSFRow row2 = sheet.createRow(1);
			row2.createCell(0).setCellValue("Priya");
			row2.createCell(1).setCellValue("23");
			row2.createCell(2).setCellValue("Karnataka");
			
			FileOutputStream fm = new FileOutputStream(file);
			book.write(fm);
			fm.close();
			book.close();
			System.out.println("WorkBook Created");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
