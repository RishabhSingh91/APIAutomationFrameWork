package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadJsonPayload;
import org.testing.utilities.LoadProperties;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC7_DummyPost {
	static HTTPMethods http ;
	@BeforeClass
	public static void loadProp() throws IOException
	{
		Properties p = LoadProperties.properties("../AutomationProject/URI.properties");
		 http = new HTTPMethods(p);
	}
	@Test(priority = 1)
	public void post() throws FileNotFoundException
	{
		String body=LoadJsonPayload.LoadJson("../AutomationProject/src/test/java/org/testing/Payloads/dummyEmp.json");
		Response res = http.PostRequest("DummyPost", body);
		ResponseValidate.statusCodeValidate(201, res);
		ResponseValidate.dataValidate("success", res, "status");
	}
	@Test(priority = 2)
	public void get()
	{
		Response res = http.GetRequest("DummyGet");
		ResponseValidate.statusCodeValidate(200, res);
		ResponseValidate.dataValidate("success", res, "status");
	}

}
