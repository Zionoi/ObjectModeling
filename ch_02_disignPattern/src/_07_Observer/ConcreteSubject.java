package _07_Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	// 감시자를 담을 리스트 
	List<Observer> observers = new ArrayList<>();  // 인터페이스Observer를 다 상속받고있어서 Observer를 의존하는게 좋다
					// 구독 누른사람. 구독을 누르면 observers 리스트에 추가한다
	
	@Override
	public void registerObserver(Observer o ) { // Observer o = new ObserverA() 하게되면 ObserverA 구독 완료 출력됨
			observers.add(o);
			System.out.println(o + " 구독 완료");
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o); // 리스트 목록에서 o 객체 삭제 
		System.out.println(o + " 구독 취소");

	}
	
	
	// 감시자에게 이벤트 송신
	@Override
	public void notifyObserver() {
		for(Observer o : observers) {
			o.update(); 	// 위임 Observer에 있는 update를 ObserverA, B가 오버라이딩 한상태 여기서 update를 실행하면 오버라이딩된 각 객체에서 호출됨
		}

	}

}
