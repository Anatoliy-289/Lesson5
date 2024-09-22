package service;

import java.util.List;

import model.DB.DataBase;
import model.impl.Student;

public class StudyGroupService {
    
//метод создания учебной группы
    public StudyGroup createStudyGroup(String teacherName, String teacherLastName, List<Student> students, int groupId) {
        List<Student> listStudent = new List<>();
        for(Student student: students) {
            listStudent.add(student);
        }
        return new StudyGroup(teacherName, teacherLastName, List<Student>, groupId);
    }
}