package view;

import java.util.List;
import java.util.Scanner;

import controller.StudyGroupController;
import model.DB.DataBase;
import model.impl.Student;
import model.impl.StudyGroup;
import service.StudyGroupService;

public class StudyGroupView {
    private StudyGroupController controller = new StudyGroupController();

    private StudyGroup getStudyGroup() {
        StudyGroup studyGroup = controller.getStudyGroup();
        System.out.println(studyGroup);
        return studyGroup;
    }
}