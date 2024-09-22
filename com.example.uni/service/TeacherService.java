package service;

import java.util.List;

import model.DB.DataBase;
import model.impl.Teacher;

public class TeacherService {
    
    //метод возвращает учителя
    public Teacher createTeacher (String teacherName, String teacherLastName, int groupId);
        int id;
        int size = DataBase.teachersDb.size();
        //id = size + 1;
        if(size == 0) {
            id = 1;
        } else {
            id = size + 1;
        }
    
        Teacher teacher = new Teacher(id, teacherName, teacherLastName, groupId);
        DataBase.teachersDb.add(teacher);    
        return teacher;
    
    //метод добавления группы по идентификатору
    public void addGroupId(int id) {
        groups.add(id);
    }

    //метод получения всех учителей
    public List<Teacher> getAllTeachers() {
        return DataBase.teachersDb;

}
