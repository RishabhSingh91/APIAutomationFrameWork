package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelWrite {
	
	public static void Write(int sheet,int col, int row, String status) throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f = new File("../AutomationProject/TestCases.xls");
		Workbook wb = Workbook.getWorkbook(f);
		WritableWorkbook wrk = Workbook.createWorkbook(new File("../AutomationProject/TestCasesFinal.xls"),wb);
		WritableSheet s = wrk.getSheet(sheet);
		Label l = new Label(col, row, status);
		s.addCell(l);
		wrk.write();
		wrk.close();
		wb.close();
}}
