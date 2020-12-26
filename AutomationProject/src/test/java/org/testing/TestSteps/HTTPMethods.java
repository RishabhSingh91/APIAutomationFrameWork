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
	
	public Response GetRequest(String URI)
	{
		Response res= given().
				contentType(ContentType.JSON).when().get(pr.getProperty(URI));
		return res;
	}
	
	public Response GetReqUsingOneParam(String uriKey,String param)
	{
		String URI = pr.getProperty(uriKey)+"/"+param;
		Response res = given().contentType(ContentType.JSON).when().get(URI);
		return res;
	}
	
	public Response PutReq(String uriKey,String body,String param)
	{
		String URI = pr.getProperty(uriKey)+"/"+param;
		Response res = given().contentType(ContentType.JSON).when().body(body).put(URI);
		return res;
	}
	
	public Response PatchReq(String URI,String UpValue,String param)
	{
		String uriKey = pr.getProperty(URI)+"/"+param;
		Response res = given().contentType(ContentType.JSON).body(UpValue).when().patch(uriKey);
		return res;
	}
	
	public Response PostRequest(String URI, String body)
	{
		Response res = given().contentType(ContentType.JSON).when().body(body).post(pr.getProperty(URI));
		return res;
	}
	
	public Response DeleteReq(String URI, String param)
	{
		String uriKey = pr.getProperty(URI)+"/"+param;
		Response res = given().contentType(ContentType.JSON).when().delete(uriKey);
		return res;
	}

}
