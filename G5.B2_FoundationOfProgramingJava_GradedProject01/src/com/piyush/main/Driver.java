package com.piyush.main;

import com.piyush.AdminDepartment.AdminDepartment;
import com.piyush.HrDepartment.HrDepartment;
import com.piyush.TechDepartment.TechDepartment;

public class Driver {
public static void main(String[] args) {
	AdminDepartment adminobject = new AdminDepartment();
	System.out.println("Welcome to "+adminobject.departmentName());
	System.out.println(adminobject.getTodaysWork());
	System.out.println(adminobject.getWorkDeadline());
	System.out.println(adminobject.isTodayAHoliday());
	
	HrDepartment hrobject= new HrDepartment();
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Welcom to "+hrobject.departmentName());
	System.out.println(hrobject.doActivity());
	System.out.println(hrobject.getTodaysWork());
	System.out.println(hrobject.getWorkDeadline());
	System.out.println(hrobject.isTodayAHoliday());
	
	TechDepartment techobject= new TechDepartment();
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Welcom to "+techobject.departmentName());
	System.out.println(techobject.getTodaysWork());
	System.out.println(techobject.getWorkDeadline());
	System.out.println(techobject.getTechStackinformation());
	System.out.println(techobject.isTodayAHoliday());
	
	
	
}
}
