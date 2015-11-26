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
        ConvolutedClass class1 = new ConvolutedClass.Builder()
        								.withName("YOLO")
        								.withArgument1("different argument")
        								.build();
        
        System.out.println(class1.toString());
        
        ConvolutedClass class2 = new ConvolutedClass.Builder()
        								.withArgument1("yet another diff")
        								.build();
        
        System.out.println(class2.toString());
    }
}
