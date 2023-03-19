package org.tnsif.client;

import org.tnsif.entities.Student;
import org.tnsif.service.StudentService;
import org.tnsif.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		//CRUD Operation
		//create
		student.setID(24);
		student.setName("Akansha");
		service.addStudent(student);
		
		/*//Retreive data-find();
		student=service.findStudentById(21);
		System.out.println("ID: "+student.getID());
		System.out.println("ID: "+student.getName());*/
		
		
		/*//update
		student=service.findStudentById(21);
		student.setName("Nikitha");
		service.updateStudent(student);*/
		
		//delete
		student=service.findStudentById(21);
		service.removeStudent(student);
		
		

	}

}


