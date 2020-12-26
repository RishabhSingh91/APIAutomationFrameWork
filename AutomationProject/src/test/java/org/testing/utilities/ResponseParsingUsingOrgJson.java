package org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ResponseParsingUsingOrgJson {
	
	public void LoadResponse(String Body, String variableName) throws FileNotFoundException
	{
		File f = new File(Body);
		FileReader fr = new FileReader(f);
		JSONTokener tk = new JSONTokener(fr);
		JSONObject ob = new JSONObject(tk);
		String json = "";
		Set<String> allKeys = ob.keySet();
		for(String key:allKeys)
		{
			if(ob.get(key).toString().startsWith("["))
			{
					JSONArray jr = new JSONArray(ob.get(key).toString());
					JSONObject ob1 = jr.getJSONObject(0);
					JSONObject ob2 = jr.getJSONObject(1);
					Set<String> innerKey1 = ob1.keySet();
					Set<String> innerKey2 = ob2.keySet();
					for(String key1: innerKey1)
					{
						if(key1.equalsIgnoreCase(variableName))
						{
						 json =json.concat("{"+"\n"+key1+":"+ob1.get(key1).toString()+","+"\n");
						}
					}
					for(String key2: innerKey2)
					{
						if(key2.equalsIgnoreCase(variableName))
						{
						 json=json.concat(key2+":"+ob1.get(key2).toString()+"\n"+"}");
						}
					}					
			}
				else
				{
					if(key.equalsIgnoreCase(variableName))
					{
						System.out.println("The Key is: "+key+"The value is: "+ob.get(key).toString()+"\n");
					}
				}
			System.out.println(json);
			}
		
		}
	}


