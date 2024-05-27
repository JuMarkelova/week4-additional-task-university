package cy.markelova.university._main;

import cy.markelova.university.entity.Lecturer;
import cy.markelova.university.entity.Student;
import cy.markelova.university.entity.University;
import cy.markelova.university.util.ActionDriver;

public class _Main {

    public static void main(String[] args) {
//        Объявление сущностей для работы программы
        University university = new University();
        Student student1 = new Student("Petr Petrov");
        Student student2 = new Student("Margarita Margaritkina");
        Lecturer lecturer1 = new Lecturer("Vasiliy Vasilevich");
        Lecturer lecturer2 = new Lecturer("Valentina Vakentinovna", university.subjects[1]);
        university.studentsArray = new Student[]{student1, student2};
        university.lecturersArray = new Lecturer[]{lecturer1, lecturer2};
        lecturer1.setSubject(university.subjects[0]);
        ActionDriver actionDriver = new ActionDriver();

//        Вызов методов через общий интерфейс для студента
        actionDriver.makeGoToTheUniversity(student1);
        actionDriver.makeHaveLunch(student1);

//        Вызов методов через интерфейс именно для студентов
        actionDriver.makeStudentDoHomework(student2, "math");
        actionDriver.makeStudentPrepareExam(student2);
        actionDriver.makeStudentHaveExam(student2, "math");

        System.out.println();

//        Вызов методов через общий интерфейс для лектора
        actionDriver.makeGoToTheUniversity(lecturer1);
        actionDriver.makeHaveLunch(lecturer1);

//        Вызов методов через интерфейс именно для лектора
        actionDriver.makeLecturerCheckHomework(lecturer2);
        actionDriver.makeLecturerGiveLesson(lecturer1);
        actionDriver.makeLecturerConductExam(lecturer2);
    }
}