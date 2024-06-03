package cy.markelova.university.util;

import cy.markelova.university.entity.CommonInterface;
import cy.markelova.university.entity.LecturerInterface;
import cy.markelova.university.entity.StudentInterface;

public class ActionDriver {

    public void makeGoToTheUniversity(CommonInterface commonAction) {
        commonAction.goToUniversity();
    }

    public void makeHaveLunch(CommonInterface commonAction) {
        commonAction.haveLunch();
    }

    public void makeStudentDoHomework(StudentInterface student, String subject) {
        student.doHomework(subject);
    }

    public void makeStudentPrepareExam(StudentInterface student) {
        student.prepareExam();
    }

    public void makeStudentHaveExam(StudentInterface student, String subject) {
        student.haveExam(subject);
    }

    public void makeLecturerCheckHomework(LecturerInterface lecturer) {
        lecturer.checkHomework();
    }

    public void makeLecturerGiveLesson(LecturerInterface lecturer) {
        lecturer.giveLesson();
    }

    public void makeLecturerConductExam(LecturerInterface lecturer) {
        lecturer.conductExam();
    }
}