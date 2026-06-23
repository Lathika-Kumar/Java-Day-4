package kce;

interface StudentAccess {
    void fetchStudent(int id);
    void editStudent(int id);
    void saveStudent(Student student);
}

class Student implements StudentAccess {

    public void fetchStudent(int id) {
        System.out.println("Fetching Student " + id);
    }

    public void editStudent(int id) {
        System.out.println("Editing Student " + id);
    }

    public void saveStudent(Student student) {
        System.out.println("Student Saved");
    }

    public void deleteStudent(int id) {
        System.out.println("Deleting Student " + id);
    }
}

public class ex3 {
    public static void main(String[] args) {

        StudentAccess sa = new Student();

        sa.fetchStudent(101);
        sa.editStudent(101);
        sa.saveStudent(new Student());
    }
}