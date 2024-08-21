package class1.classQ;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
        // 상품 주문 정보와 최종 금액 출력

        /* 상품명: 두부, 가격: 2000, 수량: 2
           상품명: 김치, 가격: 5000, 수량: 1
           상품명: 콜라, 가격: 1500, 수량: 2
           총 결제 금액: 12000 */

//        ProductOrder[] orders = new ProductOrder[3];
        List<ProductOrder> orders = new ArrayList<>();

        // 첫 번째 주문 상품
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;
//        orders[0] = productOrder1;
        orders.add(productOrder1);

        // 두 번째 주문 상품
        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;
//        orders[1] = productOrder2;
        orders.add(productOrder2);

        // 세 번째 주문 상품
        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;
//        orders[2] = productOrder3;
        orders.add(productOrder3);


        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};

        int total = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
            // 총 금액
            total += productOrder.price * productOrder.quantity;
        }

        System.out.println("총 결제 금액: " + total );
    }
}
