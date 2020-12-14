package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonReplacement {
	
	public static String JsonValueReplacement(String body, String VariableName, String value)
	{
		body =body.replaceAll(Pattern.quote("{{"+VariableName+"}}"), value);
		return body;
	}

}
