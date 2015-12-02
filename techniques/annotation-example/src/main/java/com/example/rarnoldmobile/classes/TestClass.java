package com.example.rarnoldmobile.classes;

import com.example.rarnoldmobile.annotations.*;

@TestAnnotation(
				ApplicationName = "TestClassApp",
				commands = {"test", "example", "draw"}
			   )
public class TestClass {

	public String runTest() {
		return "This is a test";
	}
	
}
