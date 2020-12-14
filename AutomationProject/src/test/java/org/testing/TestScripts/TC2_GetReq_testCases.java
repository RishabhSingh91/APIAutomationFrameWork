package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadProperties;

public class TC2_GetReq_testCases {
	static String FilePath = "../AutomationProject/URI.properties";

	public static void main(String[] args) throws IOException {
		Properties p = LoadProperties.properties(FilePath);
		HTTPMethods http = new HTTPMethods(p);
		http.GetRequest("Employee_URI");

	}

}
