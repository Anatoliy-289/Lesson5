package controller;

import java.util.List;

import model.impl.Teacher;
import service.TeacherService;

public class TeacherController {
    
    private TeacherService service = new TeacherService();
    
    public Teacher createTeacher(String teacherName, String teacherLastName, int groupId) {
        return service.createTeacher(teacherName, teacherLastName, groupId);
    }

    public Teacher getById(int id) {

        Teacher teacher = null;
        try {
            teacher = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teacher;
    }

    public List<Teacher> getAllTeacher() {
        return service.getAllTeachers();
    }
}