package _05_BuilderPattern.Builder;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder()
						.setSize(15)
						.setCheese("체다")
						.setBread("허니오트") // 이렇게 연달아 메소드호출하는걸 메소드체이닝이라고함.
						.build(); // 빌드를 호출할때 객체가 생성된다.
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder()
				.setSize(15)
				.setBread("화이트")
				.setExtraTopping("아보카도")
				.build();
		System.out.println(menu2);
		
	}

}
