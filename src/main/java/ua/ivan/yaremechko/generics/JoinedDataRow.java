package ua.ivan.yaremechko.generics;

public class JoinedDataRow<K, V1, V2> {

	private K key;
	private V1 value1;
	private V2 value2;

	public JoinedDataRow(K key, V1 value1, V2 value2) {
		super();
		this.key = key;
		this.value1 = value1;
		this.value2 = value2;
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

	public void setValue(V1 value1) {
		this.value1 = value1;
	}

	public V2 getValue2() {
		return value2;
	}

	public void setValue2(V2 value2) {
		this.value2 = value2;
	}

	@Override
	public String toString() {
		return "[JoinerDataRow(" + key + ", " + value1 + ", " + value2 + ")]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value1 == null) ? 0 : value1.hashCode());
		result = prime * result + ((value2 == null) ? 0 : value2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JoinedDataRow other = (JoinedDataRow) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value1 == null) {
			if (other.value1 != null)
				return false;
		} else if (!value1.equals(other.value1))
			return false;
		if (value2 == null) {
			if (other.value2 != null)
				return false;
		} else if (!value2.equals(other.value2))
			return false;
		return true;
	}

}
