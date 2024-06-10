package _05_BuilderPattern.Builder;

public class SubwayBuilder {
	// 1. 서브웨이는 빌더로 만들거기때문에 서브웨이의 속성(멤버변수) 똑같이 가져온다
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vagetable;
	private String source;
	
	
	// 2. 속성의 setter메소드를 구현한다.
		// - 반환형 : 내 객체
	
	/* 메소드명 지정하는 방법
		1) 속성명과 동일 : setter메소드와 구분을 위해서. -> size(int size)
		2) set속성명 -> setSize(int size) 
		3) with속성명 : setter메소드와 구분을 위해 'with'라는 키워드 사용. -> withSize(int size)
	*/
	
//  이 세개중에 하나로 메소드명 만들어주면 됨. 무조건은 아님
//	size(int size)
//	setSize(int size)
//	withSize(int size)
	
	
	
	
	// 원래 세터메소드에는 리턴이 없으나 빌더를 사용하려면 리턴값을 본인 객체로 구현해야한다
	public SubwayBuilder setSize(int size) {
		this.size = size;
		return this; // 자신 객체를 반환.
	}
	
	public SubwayBuilder setBread(String bread) {
		this.bread = bread;
		return this;
	}
	public SubwayBuilder setCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}
	public SubwayBuilder setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
		return this;

	}
	public SubwayBuilder setVagetable(boolean vagetable) {
		this.vagetable = vagetable;
		return this;

	}
	public SubwayBuilder setSource(String source) {
		this.source = source;
		return this;

	}

//	3. subway객체를 생성하여 리턴 : Subway생성자 호출로
	public Subway build() {
		return new Subway(size, bread, cheese, extraTopping, vagetable, source);//중요
	}
	
	@Override
	public String toString() {
		return "SubwayBuilder [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping="
				+ extraTopping + ", vagetable=" + vagetable + ", source=" + source + "]";
	}
	
	
	
	

}
