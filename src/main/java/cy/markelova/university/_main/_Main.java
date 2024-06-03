package cy.markelova.university._main;

import cy.markelova.university.entity.Lecturer;
import cy.markelova.university.entity.Student;
import cy.markelova.university.entity.University;
import cy.markelova.university.util.ActionDriver;

public class _Main {

    public static void main(String[] args) {
        University university = new University();
        Student student1 = new Student("Petr Petrov", university);
        Student student2 = new Student("Margarita Margaritkina", university);
        Lecturer lecturer1 = new Lecturer("Vasiliy Vasilevich");
        Lecturer lecturer2 = new Lecturer("Valentina Vakentinovna", university.getSubjects(1), university);
        university.setStudentsArray(new Student[]{student1, student2});
        university.setLecturersArray(new Lecturer[]{lecturer1, lecturer2});
        lecturer1.setSubject(university.getSubjects(0));
        ActionDriver actionDriver = new ActionDriver();
//        Calling methods through a CommonInterface for the student
        actionDriver.makeGoToTheUniversity(student1);
        actionDriver.makeHaveLunch(student1);
//        Calling methods through the StudentInterface
        actionDriver.makeStudentDoHomework(student2, "math");
        actionDriver.makeStudentPrepareExam(student2);
        actionDriver.makeStudentHaveExam(student2, "math");
        System.out.println();
//        Calling methods through a CommonInterface for the lecturer
        actionDriver.makeGoToTheUniversity(lecturer1);
        actionDriver.makeHaveLunch(lecturer1);
//        Calling methods through the LecturerInterface
        actionDriver.makeLecturerCheckHomework(lecturer2);
        actionDriver.makeLecturerGiveLesson(lecturer1);
        actionDriver.makeLecturerConductExam(lecturer2);
    }
}