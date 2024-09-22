package view;

import java.util.List;
import java.util.Scanner;

import controller.TeacherController;
import model.DB.DataBase;
import model.impl.Teacher;

public class TeacherView {
    private TeacherController controller = new TeacherController();

    public void start() {
        DataBase.fillDb();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("5 - создать учителя");
            System.out.println("6 - найти учителя по id группы");
            System.out.println("7 - распечатать информацию обо всех учмтелях");
            System.out.println("8 - выход");
            
            switch (scanner.nextInt()) {
                case 5 -> createTeacher();
                case 6 -> getById(); 
                case 7 -> getAllTeachers();
                case 8 -> System.exit(0); //выход из приложения
            
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private Teacher createTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя учителя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию учителя: ");
        String lastName = scanner.nextLine();
        System.out.println("Введите номер группы, у которой преподает учитель: ");
        int groupId = scanner.nextInt();
        Teacher teacher = controller.createTeacher(name, lastName, groupId);
        System.out.println(teacher);
        return teacher;
    }

    private Teacher getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id группы: ");
        int Id = scanner.nextInt();
        Teacher teacher = controller.getById(Id);
        System.out.println(teacher);
        return teacher;
    }

    private List<Teacher> getAllTeachers() {
        List<Teacher> teachers = controller.getAllTeachers();
        System.out.println(teachers);
        return teachers;
    }

}
