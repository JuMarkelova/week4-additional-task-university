package cy.markelova.university.entity;

import cy.markelova.university.util.CommonAction;
import cy.markelova.university.util.StudentAction;

public class Student implements CommonAction, StudentAction {

    String fullName = null;

    Student(String fullName) {
        this.fullName = fullName;
    }

    public void goToUniversity() {
        System.out.println("I'm a student and i'm going to the university on foot.");
    }

    public void prepareExam() {
        System.out.println("I have to prepare for my next exam.");
    }

    public void haveExam(String subject) {
        System.out.println("I'm having a " + subject + " exam. I hope I will pass it.");
    }

    public void doHomework(String subject) {
        System.out.println("I'm doing my homework on " + subject + ".");
    }

    public void haveLunch() {
        System.out.println("I'm a student and I eat the cheapest pie");
    }
}