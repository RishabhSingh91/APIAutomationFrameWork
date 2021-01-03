package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead {
	
	public static String Read(int sheet, int row, int col) throws BiffException, IOException
	{
		File f = new File("../AutomationProject/TestCases.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet(sheet);
		String data = s.getCell(col,row).getContents();
		return data;
	}

}
