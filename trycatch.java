package KiteZerodha;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import Com.Config.Configuration;

public class Utility {
	public  static String kitesheet(int row, int cell) throws IOException {

		String data;

		FileInputStream file = new FileInputStream(Configuration.exelsheetpath);

		Sheet sh = WorkbookFactory.create(file).getSheet("Kite");

		try {
			data = sh.getRow(row).getCell(cell).getStringCellValue();
		} catch (IllegalStateException t) {
			long data1 = (long) sh.getRow(row).getCell(cell).getNumericCellValue();
			data = ("" + data1);
		}
		return data;
	}
}
