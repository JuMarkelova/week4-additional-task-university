package cy.markelova.university.entity;

import cy.markelova.university.util.CommonAction;
import cy.markelova.university.util.LecturerAction;

public class Lecturer implements CommonAction, LecturerAction {

    private String fullName;
    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Lecturer(String fullName) {
        this.fullName = fullName;
    }

    public Lecturer(String fullName, String subject) {
        this.fullName = fullName;
        this.subject = subject;
    }

    public void goToUniversity() {
        System.out.println("I'm a lecturer and I'm going to the university by bus.");
    }

    public void haveLunch() {
        System.out.println("I'm a lecturer, and I just drink coffee; that's the only thing I need.");
    }

    public void checkHomework() {
        System.out.println("I'm so tired of checking all my students' homework, but it's part of my job.");
    }

    public void giveLesson() {
        System.out.println("I like my subject — " + subject + ". And i love to share my knowledge with students.");
    }

    public void conductExam() {
        System.out.println("Let's check what you were able to absorb, and I wish you good luck with your " + subject + " exam.");
    }
}