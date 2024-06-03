package cy.markelova.university.entity;

public class University {

    private String name = "NSU";
    private Student[] studentsArray;
    private Lecturer[] lecturersArray;
    private String[] subjects = {"math", "ift", "physics", "chemistry", "history"};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public void setStudentsArray(Student[] studentsArray) {
        this.studentsArray = studentsArray;
    }

    public Lecturer[] getLecturersArray() {
        return lecturersArray;
    }

    public void setLecturersArray(Lecturer[] lecturersArray) {
        this.lecturersArray = lecturersArray;
    }

    public String getSubjects(int number) {
        return subjects[number];
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
}