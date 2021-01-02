package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC2_GetReq_testCases {
	static String FilePath = "../AutomationProject/URI.properties";
	
	@Test
	public void testcase1() throws IOException {
		Properties p = LoadProperties.properties(FilePath);
		HTTPMethods http = new HTTPMethods(p);
		Response res =http.GetReqUsingOneParam("Address_URI", "1555506993");
	
		ResponseValidate.statusCodeValidate(200, res);
		ResponseValidate.dataValidate("1555506993", res, "id");
	}

}
