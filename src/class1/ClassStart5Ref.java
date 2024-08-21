package class1;

public class ClassStart5Ref {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

//        Student[] students = new Student[] {student1, student2};
          Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++){
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }

        for (int i = 0; i < students.length; i++){
            // 변수로 지정
            Student std = students[i];
            System.out.println("이름:" + std.name + " 나이:" + std.age + " 성적:" + std.grade);
        }

        // 향상된 for문
        for (Student std : students){
            System.out.println("이름:" + std.name + " 나이:" + std.age + " 성적:" + std.grade);
        }
    }
}
