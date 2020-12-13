package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods {
	
	Properties pr;
	
	public HTTPMethods(Properties pr)
	{
		this.pr = pr;
	}
	
	public void GetRequest(String URI)
	{
		Response res= given().
				contentType(ContentType.JSON).when().get(pr.getProperty(URI));
		System.out.println("Status code for the request is: "+ res.getStatusCode());
		System.out.println("The response on fetching the result is: "+ res.asString());
	}
	
	public void PostRequest(String URI, String body)
	{
		Response res = given().contentType(ContentType.JSON).when().body(body).post(pr.getProperty(URI));
		System.out.println("Status code for the post request is: "+ res.statusCode());
	}

}
