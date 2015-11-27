package com.example.rarnoldmobile;

import com.example.rarnoldmobile.classes.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
         * Lazy instantiation of a singleton
         * 	Upon call to "getInstance" it will check whether instantiation has occurred
         * 		if so - return that instance
         * 		if not - create a new instance to return
         */
    	
    	LazyInstantiate lazyTest = LazyInstantiate.getInstance();
        lazyTest.testMessage = "lazy test";
        LazyInstantiate lazyTestCopy = LazyInstantiate.getInstance();
        System.out.println(lazyTestCopy.testMessage);
        
        
        /*
         * Eager instantiation of a singleton
         * When class loading occurs - the singleton will automatically create a copy of itself
         * Upon call to "getInstance" it will return the instance
         * 
         */
        
        EagerInstantiate eagerTest = EagerInstantiate.getInstance();
        eagerTest.testMessage = "eager test";
        EagerInstantiate eagerTestCopy = EagerInstantiate.getInstance();
        System.out.println(eagerTestCopy.testMessage);
        
        
        /*
         * ENUM Singleton
         * Special type that allows a static list of types to be referenced
         * Instantiates on it's own at class load
         * It has to be accessed statically
         */
        
        System.out.println("Enum Test, Monday Index: " + EnumType.MONDAY.getDayIndex());
    }

}
