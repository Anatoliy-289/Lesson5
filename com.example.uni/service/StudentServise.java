package service;

import model.DB.DataBase;
import model.impl.Student;

public class StudentServise {
    
    //метод возвращает студента
    public Student createStudent(String name, String lastName, int groupId) {
        int id;
        int size = DataBase.studentsDb.size();
        //id = size + 1;
        if(size == 0) {
            id = 1;
        } else {
            id = size + 1;
        }
        Student student = new Student(groupId, name, lastName, groupId);
        DataBase.studentsDb.add(student);
        return student;
    }

    // метод получения пользователья по id
    public Student getById(int id) {
        Student student = DataBase.studentsDb //список студентов
                .stream() //запускаем поток для вычислений
                //пример лямбда-выражения (s -> s.getId() == id)
                .filter(s -> s.getId() == id) //вызываем метод filter, фильтруя пo некоторму условию (s = student(переменная))
                .findFirst() //вернуть первого найденного студента
                .orElse(null); //если не нашли, вернуть null
        if (student == null) {
            throw new Exception("student not found"); //выбрасываем проверяемое исключение, которое компилятор требует обработать
        }
    }

    //метод получения всех студентов
    public List<Student> getAllStudents() {
        return DataBase.studentsDb;
    }
}
