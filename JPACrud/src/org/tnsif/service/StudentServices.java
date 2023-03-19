package org.tnsif.service;

public interface StudentServices {
		
		//abstract method
		void add(Student student);
		void update(Student student);
		void delete(Student student);
		Student get(int rollno);

}
