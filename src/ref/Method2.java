package ref;

public class Method2 {
    public static void main(String[] args) {
//        Student student1 = new Student(); // x001
//        initStudent(student1, "학생1", 18, 80); // student1 => x001
//
//        Student student2 = new Student();
//        initStudent(student2, "학생2", 16, 90);

        Student student1 = createStudent("학생1", 18,80);
        Student student2 = createStudent("학생2", 16, 90);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        // student를 만들고
        Student student = new Student();
        // 만들어진 student값을 세팅하고
        student.name = name;
        student.age = age;
        student.grade = grade;

        // 만들어진 student의 참조값을 반환
        return student;
    }

//    static void initStudent(Student student, String name, int age, int grade){
//        student.name = name;
//        student.age = age;
//        student.grade = grade;
//    }

    static void printStudent(Student student){ // student => x001
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade) ;
    }
}
