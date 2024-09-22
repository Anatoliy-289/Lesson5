package controller;

import java.util.List;

import model.impl.Student;
import service.StudentServise;

public class StudentController {
    
    private StudentServise service = new StudentServise();
    
    public Student createStudent(String name, String lastName, int groupId) {
        return service.createStudent(name, lastName, groupId);
    }

    public Student getById(int id) {

        Student student = null;
        try {
            student = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
}