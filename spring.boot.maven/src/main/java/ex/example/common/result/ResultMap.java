package ex.example.common.result;

import java.util.HashMap;

@SuppressWarnings("serial")
public class ResultMap<K, V> extends HashMap<K, V> {

	public void add(K key, V value) {
		this.put(key, value);
	}
	
}