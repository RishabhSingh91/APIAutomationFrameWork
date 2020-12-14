package org.testing.trigger;

import java.io.IOException;

import org.testing.TestScripts.TC1_PostReq_testCases;
import org.testing.TestScripts.TC2_GetReq_testCases;

public class Trigger {

	public static void main(String[] args) throws IOException {
		
		TC1_PostReq_testCases tc1 = new TC1_PostReq_testCases();
		tc1.testcase1();
		TC2_GetReq_testCases tc2 = new TC2_GetReq_testCases();
		tc2.testcase1();

	}

}
