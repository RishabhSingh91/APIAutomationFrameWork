package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.ExcelRead;
import org.testing.utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import jxl.read.biff.BiffException;

public class TC4_PUT_Request {
	
	 @Test
	 public void tc4() throws IOException, BiffException
	 {
		 String id = ExcelRead.Read(0, 4, 4);
		 JSONObject obj = new JSONObject();
		 obj.put("FirstName", "Rajat");
		 obj.put("LastName", "Jamwal_updated");
		 obj.put("Dept", "IT");
		 obj.put("Designation", "Lead");
		 obj.put("Age", "33");
		 obj.put("id", TC1_PostReq_testCases.idValue);
		 
		 Properties p = LoadProperties.properties("../AutomationProject/URI.properties");
		 HTTPMethods method = new HTTPMethods(p);
		 Response res= method.PutReq("Employee_URI", obj.toString(), id);
		 ResponseValidate.statusCodeValidate(200, res);
		 ResponseValidate.dataValidate("Jamwal_updated", res, "LastName");
		 System.out.println("Updated data is: "+ res.asString());
		 
	 }

}
