import java.util.ArrayList;

public class Subject {
	public ArrayList<Observer> observers;

	Subject(){
		observers = new ArrayList<Observer>();
	}
	public void attach(Observer o) {
		observers.add(o);
	}
	public void detach(Observer o) {
		observers.remove(o);
	}
	public void tsuushi() {
		for(Observer observer:observers) {
			observer.update(this);
		}
	}
}
