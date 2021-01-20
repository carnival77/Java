package com.app1;

import com.app1.Student;

public class TestStudent {

	public static void main(String[] args) {

		Student[] std = new Student[3];

		std[0] = new Student("Kim", 100, 90, 95, 89);
		std[1] = new Student("Lee", 60, 70, 99, 98);
		std[2] = new Student("Park", 68, 86, 60, 45);

		for (Student student : std) {
			System.out.printf("%s ���: %.2f ����: %s\n", student.getName(), student.getAvg(), student.getGrade());
		}

	}
}
