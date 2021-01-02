package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC6_Patch_Request {
	
	@Test
	public void TC6_FnameUp() throws IOException {
	JSONObject obj = new JSONObject();
	obj.put("FirstName", "Anirudh");
	Properties p = LoadProperties.properties("../AutomationProject/URI.properties");
	HTTPMethods http = new HTTPMethods(p);
	Response res =http.PatchReq("Employee_URI", obj.toString(), "1209000985");
	ResponseValidate.statusCodeValidate(200, res);
	System.out.println("The updated body is: "+ res.asString());
	}
}
