import java.util.List;

public interface IStudentDao {

    void saveStudent(Student student);

    void updateStudent(Student student);

    Student getStudentById(long id);

    List<Student> getAllStudents();

    void deleteStudent(long id);

}