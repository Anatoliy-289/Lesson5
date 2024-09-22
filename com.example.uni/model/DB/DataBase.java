package model.DB;

import java.util.ArrayList;
import java.util.List;

import model.impl.Student;
import model.impl.Teacher;
//симулирует реальную базу данных
public class  DataBase {
    public static final List<Student> studentsDb = new ArrayList<>();

    public static final List<Teacher> teachersDb = new ArrayList<>();

    public static void fillDb() {
        Teacher teacher = new Teacher(1, "Joseph", "Frank", 1);
        Teacher teacher1 = new Teacher(2, "Andrew", "Green", 2);
        Teacher teacher2 = new Teacher(3, "Rupert", "Friend", 3);
        teacher.addGroupId(1);
        teacher.addGroupId(2);
        teacher.addGroupId(3);
        teachersDb.add(teacher);
        teachersDb.add(teacher1);
        teachersDb.add(teacher2);
        Student s1 = new Student(1, "Tom", "Taylor", 1);
        Student s2 = new Student(2, "Arnold", "Green", 1);
        studentsDb.add(s1);
        studentsDb.add(s2);
    }
}