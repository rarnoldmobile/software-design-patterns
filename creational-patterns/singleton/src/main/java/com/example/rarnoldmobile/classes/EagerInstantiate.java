package com.example.rarnoldmobile.classes;

public class EagerInstantiate {

	private static final EagerInstantiate INSTANCE = new EagerInstantiate();

	public String testMessage;
	
	private EagerInstantiate() {}

	public static EagerInstantiate getInstance() {
	        return INSTANCE;
	}
	
}
