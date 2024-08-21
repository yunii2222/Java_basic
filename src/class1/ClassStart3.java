package class1;

public class ClassStart3 {
    public static void main(String[] args) {

        // 설계도 = 붕어빵틀(클래스)를 기반으로 실제 메모리에 만들어진 객체 또는 인스턴스  = 붕어빵
        // 첫번째 학생을 담아둘 수 있는 변수 선언
        Student student1; // => 인스턴스 참조값 보관(메모리 주소)

        // 변수를 통해 학생을 사용할 수 있다.
        student1 = new Student();

        // .을 통해서 접근할 수 있다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        // 객체 또는 인스턴스  = 붕어빵
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);

    }
}
