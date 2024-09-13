package com.mentor;

public class Classroom {
	Mentors mentor;
	
	public Classroom(Mentors mentor) {
		this.mentor=mentor;
		
	}
	public void conductSession() {
		mentor.teach();
		mentor.takeAttendence();
	}

}
