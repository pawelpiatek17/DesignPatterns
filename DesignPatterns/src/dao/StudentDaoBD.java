package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoBD implements StudentDao{

	private List<Student> students;
	
	public StudentDaoBD() {
		students = new ArrayList<>();
	}
	@Override
	public List<Student> getAllStudents() {
		System.out.println("List od students from DB");
		return students;
	}

	@Override
	public Student getStudent(int id) {
		System.out.println("getting student from DB");
		for (Student student : students) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	@Override
	public boolean updateStudent(Student newStudent) {
		System.out.println("updating student with id=" + newStudent.getId() + " in DB ");
		for (Student student : students) {
			if (student.getId() == newStudent.getId()) {
				student = newStudent;
				return true;
			}
		}
		students.add(newStudent);
		return true;	
	}

	@Override
	public boolean deleteStudent(Student delStudent) {
		System.out.println("Deleting student with id= "+ delStudent.getId() + "from DB");
		for (Student student : students) {
			if (student.getId() == delStudent.getId()) {
				students.remove(student);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addStudent(Student student) {
		System.out.println("adding student to DB");
		students.add(student);
		return true;
	}
}
