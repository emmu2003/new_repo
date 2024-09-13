package com.mentor;

public class kodnest {

	public static void main(String[] args) {
		
		Mentors mentor = new Sqlmentor();
		Classroom cr = new Classroom(mentor);
		cr.conductSession();

	}

}
