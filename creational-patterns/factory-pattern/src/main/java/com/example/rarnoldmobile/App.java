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
        System.out.println( "Hello World!" );
        AutoFactory factory = new SampleAutoFactory();
        System.out.println(factory.getCurrentCar().getName());
        
    }
}
