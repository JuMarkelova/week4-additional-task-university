package cy.markelova.university.util;

public class ActionDriver {

    public void makeGoToTheUniversity(CommonAction commonAction) {
        commonAction.goToUniversity();
    }

    public void makeHaveLunch(CommonAction commonAction) {
        commonAction.haveLunch();
    }

    public void makeStudentDoHomework(StudentAction student, String subject) {
        student.doHomework(subject);
    }

    public void makeStudentPrepareExam(StudentAction student) {
        student.prepareExam();
    }

    public void makeStudentHaveExam(StudentAction student, String subject) {
        student.haveExam(subject);
    }

    public void makeLecturerCheckHomework(LecturerAction lecturer) {
        lecturer.checkHomework();
    }

    public void makeLecturerGiveLesson(LecturerAction lecturer) {
        lecturer.giveLesson();
    }

    public void makeLecturerConductExam(LecturerAction lecturer) {
        lecturer.conductExam();
    }
}