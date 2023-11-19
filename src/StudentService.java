import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentService { // lớp dịch
    // Generic - tham số cho kiểu dữ liệu
    public static List<Student> studentList = new LinkedList<>();

    public StudentService() {

    }
    public void add(Student s){
        studentList.add(s);
    }
    public List<Student> findAll(){
        return studentList;
    }
    public void delete(Student s){
        studentList.remove(s);
    }
}
