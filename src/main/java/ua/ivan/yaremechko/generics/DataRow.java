package ua.ivan.yaremechko.generics;

public class DataRow<K, V1> {

	private K key;
	private V1 value1;

	public DataRow(K key, V1 value) {
		super();
		this.key = key;
		this.value1 = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V1 getValue() {
		return value1;
	}

	public void setValue(V1 value) {
		this.value1 = value;
	}

	@Override
	public String toString() {
		return "[DataRow (" + key + ", " + value1 + ")]";
	}

}
