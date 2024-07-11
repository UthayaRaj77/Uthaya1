package org.tcs.test.login;

import java.util.LinkedHashSet;
import java.util.Set;

public class Employee{

	
	public static void main(String[] args) {
		
	Set<Details> s = new LinkedHashSet <Details>();
	
	Details d1 = new Details ();
	d1.setEmpId(12345);
	d1.setEmpName("Uthaya");
	d1.setEmpPhone(9876543212l);
	
	Details d2 = new Details();
	d2.setEmpId(87654);
	d2.setEmpName("Raju");
	d2.setEmpPhone(9098786543l);
	
	
	s.add(d1);
	s.add(d2);


	
	
    for (Details details : s) {
    	
	}

	
	
	
	}
	
}
