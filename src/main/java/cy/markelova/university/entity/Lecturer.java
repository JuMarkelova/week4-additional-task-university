package cy.markelova.university.entity;

import cy.markelova.university.util.CommonAction;
import cy.markelova.university.util.LecturerAction;

public class Lecturer implements CommonAction, LecturerAction {

    String fullName;
    String subject;

    Lecturer(String fullName, String subject) {
        this.fullName = fullName;
        this.subject = subject;
    }

    public void goToUniversity() {
        System.out.println("I'm a lecturer and I'm going to the university by bus.");
    }

    public void haveLunch() {
        System.out.println("I'm a lecturer and I just drink coffee, that's the only what I need.");
    }

    public void checkHomework() {
        System.out.println("I'm so tired to check all my student's homeworks, but it's a part of my job.");
    }

    public void giveLesson() {
        System.out.println("I like my subject - " + subject + ". And i love to share my knowledge with students.");
    }

    public void conductExam() {
        System.out.println("Lets check what you was able to absorb and wish you good luck with " + subject + " exam.");
    }
}