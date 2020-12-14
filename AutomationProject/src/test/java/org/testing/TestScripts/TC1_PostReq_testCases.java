package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadProperties;

public class TC1_PostReq_testCases {

	public static void main(String[] args) throws IOException {
		String FilePath ="../AutomationProject/URI.properties";
		Properties p = LoadProperties.properties(FilePath);
		JSONObject obj = new JSONObject();
		obj.put("FirstName", "Himanshu");
		obj.put("LastName", "Mishra");
		obj.put("id", "4243");
		obj.put("Dept", "IT");
		obj.put("Age", "29");
		
		HTTPMethods http = new HTTPMethods(p);
		http.PostRequest("Employee_URI", obj.toString());

	}

}
