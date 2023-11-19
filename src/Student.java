public class Student {// Lớp POJO - lớp bình thường chứa dư liệu
    // thuộc tính tĩnh
    public static String schoolName ;
    private int id;
    private String name;
    private int age;
     // phương thức khởi tạo

    public Student() {
        // khởi tạo các giá trị cho thuộc tính
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // các phương thức setter getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void inputData(){
        // nhập dữ lieu cho các thuộc tính

    }


    @Override // ghi đè lại phương thức đã được kế thừa
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
