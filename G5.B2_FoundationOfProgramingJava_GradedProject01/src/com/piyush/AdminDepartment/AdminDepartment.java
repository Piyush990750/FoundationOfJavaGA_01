package com.piyush.AdminDepartment;

import com.piyush.SuperDepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment{
	
	public String departmentName() {
		return " Admin Department";
	}
	public String getTodaysWork() {
		return "Complete your document Submission";
	}
	public String getWorkDeadline() {
		return "Complete By EOD";
	}
	

}
