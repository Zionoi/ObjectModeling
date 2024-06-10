package _02_FactoryPattern_answer;

public class ProductFactory {
	
	public static Product getInstance(String name) {
		Product product = new Product(); // 여기서 객체생성을 해야함
		
		if(name.equalsIgnoreCase("tv")) { // tv 문자열이 들어오면 tv로 세팅 .equalsIgnoreCase()문자 소문자 안가리고 비교
			product.setName("Tv");
			product.setPrice(300);
		}else if(name.equalsIgnoreCase("computer")){ //computer면 컴퓨터로 세팅 
			product.setName("Computer");
			product.setPrice(200);
		}
		return product; //객체를 넣어서 객체를 반환
	
	}
}
