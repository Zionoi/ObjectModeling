package _04_BuilderPattern.constructor;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new Subway(15, "화이트","체다치즈");
		System.out.println(menu1);
		
		Subway menu2 = new Subway(30, "하티", "모짜렐라치즈",null, true, "머스타드 소스");
		System.out.println(menu2);

		

	
	}

}
