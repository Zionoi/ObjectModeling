package _07_Observer;

public interface Subject {
	void registerObserver(Observer o); // 등록 메소드
	void removeObserver(Observer o); // 삭제 메소드
	void notifyObserver(); // 알림을 다 알려주는거니 매개변수 필요없음
}
