package ref;

public class NullMain1 {
    public static void main(String[] args) {
        // data 변수에는 아직 가르키는 객체가 없다.
        Data data = null;
        System.out.println("1. data = " + data);

        // 참조값 다시 넣기
        data = new Data();
        System.out.println("2. data = " + data);

        // 아무도 참조하지 않는 인스턴스
        // => 사용되지 않고 메모리 용량만 차지할 뿐 (자바에서는 <가비지 컬렉션>을 사용해 자동으로 제거해준다.)
        data = null;
        System.out.println("3. data = " + data);
    }
}
