package com.example.rarnoldmobile.classes;

public class LazyInstantiate {

	private static volatile LazyInstantiate instance;
	private LazyInstantiate() { }
	
	public String testMessage;
	
    public static LazyInstantiate getInstance() {
        if (instance == null ) {
            synchronized (LazyInstantiate.class) {
                if (instance == null) {
                    instance = new LazyInstantiate();
                }
            }
        }

        return instance;
    }
	
}
