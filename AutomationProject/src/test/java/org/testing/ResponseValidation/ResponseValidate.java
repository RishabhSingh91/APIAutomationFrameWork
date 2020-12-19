package org.testing.ResponseValidation;

import org.testing.utilities.ParsingJsonUsingJsonPath;

import com.jayway.restassured.response.Response;

public class ResponseValidate {
	public static void statusCodeValidate(int expectedCode, Response res)
	{
		if(expectedCode == res.getStatusCode())
		{
			System.out.println("Status code is as expected");
		}
		else
		{
			System.out.println("Status code is not matching");
		}
	}
	
	public static void dataValidate(String expectedData, Response res, String jsonPath)
	{
		if(expectedData.equals(ParsingJsonUsingJsonPath.parseJson(res, jsonPath)))
		{
			System.out.println("The provided data matches");
		}
		else
		{System.out.println("Mismatched in the expected and actual data");}
	}
}
