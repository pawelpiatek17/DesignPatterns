package dao;

import java.util.List;

public interface StudentDao {
	List<Student> getAllStudents();
	Student getStudent(int id);
	boolean updateStudent(Student student);
	boolean deleteStudent(Student student);
	boolean addStudent(Student student);
}
