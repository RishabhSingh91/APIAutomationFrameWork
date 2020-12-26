package org.testing.trigger;

import java.io.IOException;

import org.testing.TestScripts.TC1_PostReq_testCases;
import org.testing.TestScripts.TC2_GetReq_testCases;
import org.testing.TestScripts.TC3_Get_Request_AllData;
import org.testing.TestScripts.TC4_PUT_Request;
import org.testing.TestScripts.TC5_Delete_Request;
import org.testing.TestScripts.TC6_Patch_Request;
import org.testing.utilities.ResponseParsingUsingOrgJson;

public class Trigger {

	public static void main(String[] args) throws IOException {
		
/*		TC3_Get_Request_AllData tc3 = new TC3_Get_Request_AllData(); 
		TC1_PostReq_testCases tc1 = new TC1_PostReq_testCases();
		tc1.testcase1();
		System.out.println("\n"+"Data created and all records are: ");
		tc3.GetAll();
			TC2_GetReq_testCases tc2 = new TC2_GetReq_testCases();
		tc2.testcase1(); 
		TC4_PUT_Request tc4 = new TC4_PUT_Request();
		tc4.tc4();		
		TC5_Delete_Request tc5 = new TC5_Delete_Request();
		tc5.TC5();

		TC6_Patch_Request tc6 = new TC6_Patch_Request();
		tc6.TC6_FnameUp();*/
		ResponseParsingUsingOrgJson ob = new ResponseParsingUsingOrgJson();
		ob.LoadResponse("../AutomationProject/src/test/java/org/testing/Payloads/dummy.json", "number");
		
	}

}
