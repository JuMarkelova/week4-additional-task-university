package cy.markelova.university.entity;

public class Student implements PersonInterface, StudentInterface {
    private University university;
    private String fullName;
    private Lecturer lecturer;

    public Student(String fullName, University university) {
        this.fullName = fullName;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
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
        System.out.println("I'm doing my " + subject + " homework.");
    }

    public void haveLunch() {
        System.out.println("As a student, I eat the cheapest pie.");
    }
}