package com.example.rarnoldmobile;

import com.example.rarnoldmobile.annotations.*;
import com.example.rarnoldmobile.classes.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
    	TestClass testClass = new TestClass();
    	System.out.println(testClass.runTest());
    	
    	if (testClass.getClass().isAnnotationPresent(TestAnnotation.class)) {
    		System.out.println("Annotation is present");
    		
    		TestAnnotation objectAnnotation = (TestAnnotation) testClass.getClass().getAnnotation(TestAnnotation.class);
    		System.out.println("Application Name: " + objectAnnotation.ApplicationName());
    		System.out.println("Do the following commands:");
    		
    		for (int i = 0; i < objectAnnotation.commands().length; i++) {
    			System.out.println(objectAnnotation.commands()[i] );
    		}
    		
    	}
    }
}
