package _07_Observer;

public class ObserverRun {

	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		ObserverA oa = new ObserverA();
		ObserverB ob = new ObserverB();
		
		
		// 구독자(감시자)를 등록
//		subject.registerObserver(new ObserverA());
//		subject.registerObserver(new ObserverA()); // 이렇게 하면 삭제한게 아니라 객체가 두개 생성된꼴 이렇게 해야 할때도 있지만 구독취소라는 의도에 맞추려면
												// 위에 생성된 객체를 따로 뽑아야함
		
		subject.registerObserver(oa);
		subject.registerObserver(ob);
		
		subject.notifyObserver();

		subject.removeObserver(oa);  // 요로코롬
		
		subject.notifyObserver();
		
		
		
	}

}
