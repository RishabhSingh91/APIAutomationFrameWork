package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadProperties;

import com.jayway.restassured.response.Response;

public class TC5_Delete_Request {
	
	public void TC5() throws IOException
	{
	Properties p = LoadProperties.properties("../AutomationProject/URI.properties");
	HTTPMethods method = new HTTPMethods(p);
	Response res =method.DeleteReq("Employee_URI", TC1_PostReq_testCases.idValue);
	ResponseValidate.statusCodeValidate(200, res);
	}
	

}
