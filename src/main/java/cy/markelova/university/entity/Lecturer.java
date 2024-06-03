package cy.markelova.university.entity;

public class Lecturer implements CommonInterface, LecturerInterface {

    private University university;
    private String fullName;
    private String subject;
    private Student[] group;

    public Lecturer(String fullName) {
        this.fullName = fullName;
    }

    public Lecturer(String fullName, String subject, University university) {
        this.fullName = fullName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
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