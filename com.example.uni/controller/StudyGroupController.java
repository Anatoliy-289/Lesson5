package controller;

import java.util.List;

import model.impl.Student;
import service.StudyGroupService;

public class StudyGroupController {
 
    private StudyGroupService service = new StudyGroupService();

    public StudyGroup createStudyGroup(String teacherName, String teacherLastName, List<Student> students, int groupId) {
        return service.createStudyGroup(teacherName, teacherLastName, students, groupId);
    }
}