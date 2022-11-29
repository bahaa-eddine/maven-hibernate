import java.util.List;

public class ApplicationMain {

    public static void main(String[] args){
        IStudentDao studentDao = new StudentDao();

        // test saveStudent
        Student student = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
        studentDao.saveStudent(student);

        // test updateStudent
        student.setFirstName("Ram");
        studentDao.updateStudent(student);

        // test getStudentById
        Student student2 = studentDao.getStudentById(student.getId());
        System.out.println(student2);

        // test getAllStudents
        List<Student> students = studentDao.getAllStudents();
        students.forEach((student1 -> System.out.println(student1.getId())));

        // test deleteStudent
        studentDao.deleteStudent(student.getId());
    }
}
