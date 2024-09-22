// -Создать класс УчебнаяГруппа, содержащая в себе поля Преподаватель и
//  список студентов
// -Создать класс УчебнаяГруппаСервис, в котором реализована
//  функция (входные параметры-(Teacher, List<Student>)) формирования
//  из Студентов и Преподавателя УчебнойГруппы и возвращения его
// -Создать метод в Контроллере, в котором формируется учебная группа,
//  путем вызова метода из сервиса 


import java.util.List;

import model.User;

public class StudyGroup extends User {

    private String teacherName;
    private String teacherLastName;
    private List<Student> students;
    int group;

    public StudyGroup (String teacherName, String teacherLastName, List<Student> students, int groupId) {
        this.teacherName = teacherName;
        this.teacherLastName = teacherLastName;
        this.students = students;
        this.groupId = groupId;
    }


    @Override
    public String toString() {
        return "StudyGroup [teacherName=" + teacherName + ", teacherLastName=" + teacherLastName + ",
            students=" + students + ", groupId=" + groupId "]";
    }

}