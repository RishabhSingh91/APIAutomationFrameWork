package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.ExcelRead;
import org.testing.utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import jxl.read.biff.BiffException;

public class TC5_Delete_Request {
	
	@Test
	public void TC5() throws IOException, BiffException
	{
	Properties p = LoadProperties.properties("../AutomationProject/URI.properties");
	HTTPMethods method = new HTTPMethods(p);
	String id = ExcelRead.Read(0, 6, 4);
	Response res =method.DeleteReq("Employee_URI", id);
	ResponseValidate.statusCodeValidate(200, res);
	}
	

}
