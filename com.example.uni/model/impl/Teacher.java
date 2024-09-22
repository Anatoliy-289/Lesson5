package model.impl;

import model.User;

public class Teacher extends User {
    
    private final List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String teacherName, String teacherLastName, int groupId) {
        super(id, teacherName, teacherLastName, groupId);
        this.groupId = groupId;
    }
}
