package alog;

import java.util.ArrayList;
import java.util.List;

public class ClientBusinessObjectImpl {
    private StudentDataObject studentDataObject;
    private InstructorDataObject instructorDataObject;
    private ClassDataObject classDataObject;

    public ClientBusinessObjectImpl(StudentDataObject studentDataObject, InstructorDataObject instructorDataObject,
                                    ClassDataObject classDataObject){
        this.studentDataObject = studentDataObject;
        this.instructorDataObject = instructorDataObject;
        this.classDataObject = classDataObject;
    }

    public List<Student> getAllStudentsBySubject(String subject){
        List<Student> students = new ArrayList<>();
        return students;
    }

    public void markCurrentClassesInactive() {
    }
}