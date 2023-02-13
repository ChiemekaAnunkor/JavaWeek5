package test;

import alog.*;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.lang.Class;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static sun.nio.cs.Surrogate.is;

public class EducationServiceTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private StudentDataObject studentDataObject;

    @Mock
    private InstructorDataObject instructorDataObject;

    @Mock
    private ClassDataObject classDataObject;

    @InjectMocks
    private ClientBusinessObjectImpl clientBusinessObjectImpl;

    @Test
    public void testStudentsByClass(){
//        //Given
//        Student chiemeka = new Student("Chiemeka Anunkor", "Java");
//        Student emmanuel = new Student("Emmanuel Dada", "Java");
//        Student eric = new Student("Eric Drake", "Java");
//        Student ezekiel = new Student("Ezekiel Thawngcung", "Java");
//        Student hatice = new Student("Hatice Kacer-Kaymaz", "Java");
//        Student lan = new Student("Lan Kostrikin", "Java");
//        Student sajedeh = new Student("Sajedeha Ahmadi", "Java");
//
//        Student abdul = new Student("Abdulaziz", "Data");
//        Student sonalee = new Student("Sonalee Bhattacharyya", "Data");
//
//        Student paul = new Student("Paul Okoh", "WebDev");
//        Student nutan = new Student("Nutan Pal", "WebDev");
//        Student erick = new Student("Erick Estrada", "WebDev");
//
//        List<Student> allStudents = Arrays.asList(chiemeka, emmanuel, eric, ezekiel, hatice, lan, sajedeh, abdul,
//                sonalee, paul, nutan, erick);
//
//        given(studentDataObject.getAllStudents()).willReturn(allStudents);
//
//        //When
//        List<Student> javaStudents = clientBusinessObjectImpl.getAllStudentsBySubject("Java");
//
//        //Then
//        assertThat(javaStudents, hasSize(7));
//        assertThat(javaStudents, hasItems(chiemeka, emmanuel, eric, ezekiel, hatice, lan, sajedeh));

        // Given
        Student studentJM = new Student("Joy Ma", "Spanish");
        Student studentJH = new Student("Julio Hernandez", "Algebra");
        Student studentJJ = new Student("Jenny Jones", "Calculus");
        List<Student> allStudents = Arrays.asList(studentJM, studentJH, studentJJ);

        given(studentDataObject.getAllStudents()).willReturn(allStudents);

        // When
        List<Student> mathStudents = clientBusinessObjectImpl.getAllStudentsBySubject("math");

        // Then
        assertThat(String.valueOf(mathStudents.size()), is(2));
        assertThat(mathStudents, hasItems(studentJJ, studentJH));
    }


    @Test
    public void testMarkInactive() {

        // Given
        Class geometry = new Class("Geometry", "summer 2022");
        Class envSci = new Class("Environmental Science", "Fall 2022");
        Class compLit = new Class<String>("Comparative Literature", "Spring 2023");
        List<Class> allClasses = Arrays.asList(geometry, envSci, compLit);

        given(classDataObject.getAllClasses()).willReturn(allClasses);

        // When
        clientBusinessObjectImpl.markCurrentClassesInactive();

        // Then
        verify(classDataObject).markInactive(geometry);

        verify(classDataObject, Mockito.never()).markInactive(envSci);

        verify(classDataObject, Mockito.never()).markInactive(compLit);

        verify(classDataObject, Mockito.times(1)).markInactive(geometry);

    }

    // First: Setup

    @Captor
    ArgumentCaptor<Class> classArgumentCaptor;

// Next:

    @Test
    public void testMarkInactive_argumentCaptor() {
        // Given
        alog.Class geometry = new alog.Class("Geometry", "summer 2022");
        alog.Class envSci = new alog.Class("Environmental Science", "Fall 2022");
        alog.Class compLit = new alog.Class("Comparative Literature", "Spring 2023");
        List<alog.Class> allClasses = Arrays.asList(geometry, envSci, compLit);

        given(classDataObject.getAllClasses()).willReturn(allClasses);

        // When
        clientBusinessObjectImpl.markCurrentClassesInactive();

        // Then
        verify(classDataObject).markInactive(classArgumentCaptor.capture());

        assertEquals(geometry, classArgumentCaptor.getValue());
    }
}