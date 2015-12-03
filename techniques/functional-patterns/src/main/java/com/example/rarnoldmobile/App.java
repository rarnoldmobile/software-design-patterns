package com.example.rarnoldmobile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.rarnoldmobile.classes.*;


public class App 
{


	public static boolean TestSchool(School school) {
		if (school.getTeacherCount() > 15 & school.getTeacherCount() < 30) {
			return true;
		}else {
			return false;
		}
	}

	
	
    public static void main( String[] args )
    {
        List<School> schoolList = new ArrayList<School>();
        
        schoolList.add(new School("test School1", 100, 10));
        schoolList.add(new School("test School2", 200, 30));
        schoolList.add(new School("test School3", 300, 20));
        schoolList.add(new School("test School4", 120, 8));
        schoolList.add(new School("test School5", 405, 35));
        
        
        long school300plus = 
        	schoolList
        		.stream()
        		.distinct()
        		.filter(school -> school.getStudentCount() >= 300 )
        		.count();
        
        
        List<String> schoolNames = schoolList
                .stream()
                .flatMap(school -> Stream.of(school.getSchoolName()))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        
        System.out.println("School count with more than 299 students: " + school300plus);
        System.out.println("School names: " + schoolNames);
        
        System.out.println("Schools between 15 and 30 teachers:");
        
        
        for (School s : schoolList)  {
        	if (TestSchool(s)) {
        		System.out.println(s.getSchoolName());
        	}
        }
        
    }
}
