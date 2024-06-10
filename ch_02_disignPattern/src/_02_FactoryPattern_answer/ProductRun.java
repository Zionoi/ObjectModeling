package _02_FactoryPattern_answer;

import java.util.Calendar;

public class ProductRun {
    public static void main(String[] args) {
/*        Product p1 = new Product();
        p1.setName("Tv");
        System.out.print(p1);

        Product p2 = new Product();
        p2.setName("Computer");
        System.out.print(p2);*/
        
        Product p1 = ProductFactory.getInstance("tv");
        System.out.println(p1);
        
        Product p2 = ProductFactory.getInstance("computer");
        System.out.println(p2);
        
        p1 = ProductFactory.getInstance("TV"); // 만들어둔getInstance 메소드 호출 매게변수로 스트링 입력이 설정해둔 값과 같으면 해당 객체로 생성되는 메소드임
        System.out.println(p1);
        
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance().get(Calendar.YEAR));
        
        
        
    }
}

