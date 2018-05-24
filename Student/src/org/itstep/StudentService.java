package org.itstep;

import java.util.ArrayList;

public class StudentService {

	public StudentData[] getStudentInArray(){
		StudentData[] array = new StudentData [3];
		StudentData student1=new StudentData("Nastya","Lunova");
		StudentData student2=new StudentData("Nik","Harrison");
		StudentData student3=new StudentData("Alex","Popov");
		array[0]=student1;
		array[1]=student2;
		array[2]=student3;
		return array;
	}
	public ArrayList getStudentInList() {
		ArrayList list=new ArrayList();
		StudentData[] array = new StudentData [3];
		StudentData student1=new StudentData("Nastya","Lunova");
		StudentData student2=new StudentData("Nik","Harrison");
		StudentData student3=new StudentData("Alex","Popov");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		return list;
	}
}