package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC3_Get_Request_AllData {
	
	@Test
	public void GetAll() throws IOException
	{
		Properties p = LoadProperties.properties("../AutomationProject/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.GetRequest("Address_URI");
	
		/* System.out.println("data is: "); System.out.println(res.asString()); */
    	   ResponseValidate.dataValidate("SainikColony", res, "[1].AddressDetails[0].addressLine1.societyName");
	}

}
