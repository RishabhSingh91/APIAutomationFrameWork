package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.ExcelRead;
import org.testing.utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import jxl.read.biff.BiffException;

public class TC6_Patch_Request {
	
	@Test
	public void TC6_FnameUp() throws IOException, BiffException {
	JSONObject obj = new JSONObject();
	obj.put("FirstName", "Anirudh");
	Properties p = LoadProperties.properties("../AutomationProject/URI.properties");
	HTTPMethods http = new HTTPMethods(p);
	 String id = ExcelRead.Read(0, 5, 4);

	Response res =http.PatchReq("Employee_URI", obj.toString(), id);
	ResponseValidate.statusCodeValidate(200, res);
	System.out.println("The updated body is: "+ res.asString());
	}
}
