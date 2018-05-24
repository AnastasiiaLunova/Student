package org.itStep;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.itstep.StudentData;
import org.itstep.StudentService;
import org.junit.Test;

public class StudentServiceTest {

	@Test
	public void testGetStudentInArray() {
		StudentData[] array = new StudentData [3];
		StudentData student1=new StudentData("Nastya","Lunova");
		StudentData student2=new StudentData("Nik","Harrison");
		StudentData student3=new StudentData("Alex","Popov");
		array[0]=student1;
		array[1]=student2;
		array[2]=student3;
		StudentService studentService = new StudentService();
		StudentData[] studentName = studentService.getStudentInArray();
		String name = studentName[0].getFirstName();
		assertEquals("Nastya", name);
		
	}
	@Test
	public void testGetStudentInList() {
		ArrayList list=new ArrayList();
		StudentData[] array = new StudentData [3];
		StudentData student1=new StudentData("Nastya","Lunova");
		StudentData student2=new StudentData("Nik","Harrison");
		StudentData student3=new StudentData("Alex","Popov");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		StudentService studentService = new StudentService();
		ArrayList<StudentData> studentSecondName = studentService();
		String name = studentName [0].getFirstName();
		
		assert	
		}
	
	}
	
	
}
