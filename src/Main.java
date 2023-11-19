import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Scanner scanner2 =  new Scanner(System.in);

//        double a = Double.parseDouble(scanner.nextLine());
//        scanner.nextLine();
//        scanner.nextLine();

//        int a = 10;
//        Integer a = null;
//        Integer.sum(10,11); // 21
//        System.out.println(a);

        Student s1 = new Student(); // gọi đến phương thức khởi tạo ko tham số
//        s1.inputData();
        System.out.println(s1);
        Student s2 = new Student(1,"Nguyễn Văn A",19);
        System.out.println(s2);
//
//        System.out.println(Calculator.display(s2)); // "Giá trị là 2"

        // khởi tạo đối tượng array list
//        ArrayList<Integer> arr = new ArrayList<>();
        StudentService studentService1 = new StudentService();
        studentService1.add(s1);
        studentService1.add(s2);
        System.out.println(studentService1.findAll());
        StudentService studentService2 = new StudentService();
        System.out.println(studentService2.findAll());

        // truy cập thuộc tính tĩnh
//        Student.schoolName = "HANU";
//        System.out.println(s1.schoolName);
//        System.out.println(s2.schoolName);
        Calculator.sum(5);
//      tính chất trừu tượng
        Animals animals1 = new Cat(); // Animals là kiểu dữ liệu khai báo - Cat là kiểu dữ liệu thực tế
        Animals animals2 = new Dog();
        System.out.println(animals1.makeSound());
        System.out.println(animals2.makeSound());

        Action ac1 = new Cat();
        Action ac2 = new Dog();

        // gọi makeSound
        // ép kiểu ngầm định - ép kiểu từ lớp con về lớp cha
        Animals animals3 = new Cat();

        Cat c = (Cat) ac1; // ép kiểu tường minh - ép kiểu lớp cha về lớp con
        System.out.println( "mèo kêu : "+c.makeSound());

        // kiểm tra kiểu thực tế - instanceof
        if(animals1 instanceof Cat){
            Cat b = (Cat) animals1;
        }
}

    // lập trình jAVA hướng đối tượng - tất cả mọi thứ xung quanh
    // sẽ được chuyển thành lớp và đối tượng : thuộc tính và phương thức
    // Lớp là gì : là khuôn để tạo ra các đối tượng giống nhau
    // đối tượng là một giá trị cụ thể đươc tạo ra từ lớp
    // được tạo ra bằng hàm khởi tạo (constructors)


    // nguyên thủy : int , double, char, boolean, byte, short
    // dạng wrapper : Integer, Double, Character, Boolean, Byte, Short
}