package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        // 참조하는 값을 줌
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException
        System.out.println(bigData.data.value);
    }
}
