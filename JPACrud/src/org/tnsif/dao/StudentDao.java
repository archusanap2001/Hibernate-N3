package org.tnsif.dao;


	public interface StudentDao<Student> {
		
		//abstract method
		void addStudent(Student student);//creation
		Student getStudent(int rollno);//Retrieve
		void updateStudent(Student student);//update
		void removeStudent(Student student);//delete
		
		void beginTransaction();
		void commitTransaction();

	}


