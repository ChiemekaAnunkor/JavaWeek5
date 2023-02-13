package alog;

import java.util.List;

public class StudentDataObject {
    private List<Student> students;

    public StudentDataObject(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents() {
        return this.students;
    }
}