package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class ParsingJsonUsingJsonPath {
	public static String parseJson(Response res, String jsonPath )
	{
		return res.jsonPath().getString(jsonPath);
	}
}
