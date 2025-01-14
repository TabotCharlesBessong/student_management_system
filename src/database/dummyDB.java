package database;

import java.sql.Date;
import java.util.Calendar;

public class dummyDB {
	dummyDB() {
		dummyStudents();
		dummyLecturers();
		dummyAdmins();
	}
	
	private void dummyStudents() {
		studentDB student = new studentDB();
		
		// 1
		String email = "example@sdt.com";
		String pwd = "pwd";
		String name = "John Legend";
		String sex = "M";
		int level = 200;
		String qualification = "Ordinary Level";
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2000);
		cal.set(Calendar.MONTH, 00);
		cal.set(Calendar.DAY_OF_MONTH, 01);
			
	    Date date=new Date(cal.getTimeInMillis());
	    
		student.onAdd(email, pwd, name, date, sex, level, qualification);
		
		// 2
		email = "example1@sdt.com";
		pwd = "pwd1";
		name = "Peter Dru";
		sex = "M";
		level = 300;
		qualification = "Advanced Level";
		
		cal.set(Calendar.YEAR, 2001);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DAY_OF_MONTH, 15);
			
	    date = new Date(cal.getTimeInMillis());
		
	    student.onAdd(email, pwd, name, date, sex, level, qualification);
	    
	    
		// 3
		email = "example2@sdt.com";
		pwd = "pwd2";
		name = "Angie Joe";
		sex = "F";
		level = 400;
		qualification = "BAC";
		
		cal.set(Calendar.YEAR, 2002);
		cal.set(Calendar.MONTH, 05);
		cal.set(Calendar.DAY_OF_MONTH, 30);
			
	    date = new Date(cal.getTimeInMillis());
		
	    student.onAdd(email, pwd, name, date, sex, level, qualification);
	}
	
	private void dummyLecturers() {
		lecturerDB lecturer = new lecturerDB();
		
		// 1
		String email = "example@sdt.com";
		String pwd = "pwd";
		String name = "Mary Som";
		String sex = "F";
		String level = "PhD in AI";
		String field =  "Computer Engineering";
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1970);
		cal.set(Calendar.MONTH, 00);
		cal.set(Calendar.DAY_OF_MONTH, 01);
			
	    Date date=new Date(cal.getTimeInMillis());
	    
		lecturer.onAdd(email, pwd, name, date, sex, level, field);
		
		// 2
		email = "example1@sdt.com";
		pwd = "pwd1";
		name = "Martha Lum";
		sex = "F";
		level = "PhD in ML";
		field =  "Computer Engineering";
		
		cal.set(Calendar.YEAR, 1980);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DAY_OF_MONTH, 15);
			
	    date = new Date(cal.getTimeInMillis());
	    
		lecturer.onAdd(email, pwd, name, date, sex, level, field);
	    
		// 3
		email = "example2@sdt.com";
		pwd = "pwd2";
		name = "Bob Mark";
		sex = "M";
		level = "Masters in Neural Networks";
		field =  "Computer Engineering";
		
		cal.set(Calendar.YEAR, 1990);
		cal.set(Calendar.MONTH, 05);
		cal.set(Calendar.DAY_OF_MONTH, 30);
			
	    date = new Date(cal.getTimeInMillis());
	    
		lecturer.onAdd(email, pwd, name, date, sex, level, field);
	}
	
	private void dummyAdmins() {
		adminDB admin = new adminDB();
		
		// 1
		String email = "example@sdt.com";
		String pwd = "pwd";
		String name = "Larry Jules";
		String sex = "M";
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1970);
		cal.set(Calendar.MONTH, 00);
		cal.set(Calendar.DAY_OF_MONTH, 01);
			
	    Date date = new Date(cal.getTimeInMillis());
	    
		admin.onAdd(email, pwd, name, date, sex);
		
		// 2
		email = "example1@sdt.com";
		pwd = "pwd1";
		name = "Vanessa Hybe";
		sex = "F";
				
		cal.set(Calendar.YEAR, 1980);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DAY_OF_MONTH, 15);
					
		date = new Date(cal.getTimeInMillis());
			    
		admin.onAdd(email, pwd, name, date, sex);
		
		// 3
		email = "example2@sdt.com";
		pwd = "pwd2";
		name = "Sir Trudent";
		sex = "M";
						
		cal.set(Calendar.YEAR, 1990);
		cal.set(Calendar.MONTH, 05);
		cal.set(Calendar.DAY_OF_MONTH, 30);
							
		date = new Date(cal.getTimeInMillis());
					    
		admin.onAdd(email, pwd, name, date, sex);
	}
}
