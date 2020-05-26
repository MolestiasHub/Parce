package bytee;

import java.util.HashMap;

public class Pair<T1, T2> {
	private HashMap <Integer,T1> one = new HashMap<Integer,T1>();
	private HashMap <Integer,T2> two = new HashMap<Integer,T2>();

	public void pairing(T1 a,T2 b) {
		one.put(1,a);
		two.put(2,b);
	}
	public Pair get() {
		
		return null;
		
	}
	public T1 getKey () {
		return one.get(1);
		
	}
	public T2 getValue () {
		return two.get(2);
		
	}
}
