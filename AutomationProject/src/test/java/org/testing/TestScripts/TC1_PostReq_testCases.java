package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.LoadJsonPayload;
import org.testing.utilities.LoadProperties;
import org.testing.utilities.ParsingJsonUsingJsonPath;

import com.jayway.restassured.response.Response;

// Post request-----> body -------->from a json file
public class TC1_PostReq_testCases {
	
	static String idValue;

	public void testcase1() throws IOException
	{
		Random ran = new Random();
		Integer id = ran.nextInt();
		Properties p = LoadProperties.properties("../AutomationProject/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		String body = LoadJsonPayload.LoadJson("../AutomationProject/src/test/java/org/testing/Payloads/EmployeeDetails.json");
		body =JsonReplacement.JsonValueReplacement(body, "id", id.toString());
		Response res =http.PostRequest("Employee_URI", body);
		idValue =ParsingJsonUsingJsonPath.parseJson(res, "id");
		System.out.println("Status of the request is: "+res.statusCode()+" and the id sent is: "+ idValue);
		
		ResponseValidate.statusCodeValidate(201, res);
		ResponseValidate.dataValidate(idValue, res, "id");
		System.out.println("Created data is: "+ res.asString());
	}

}
