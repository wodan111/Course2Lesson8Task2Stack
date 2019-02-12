package ua.testov.test;

import java.util.Arrays;

public class Stack implements Cloneable{
	private Object[] obj = new Object[5];
	private int i = -1;

	public Stack() {
		super();
	}

	public int addElement(Object o) {
		if (i < 4) {
			i = i + 1;
			obj[i] = o;
		}else {
			System.out.println("stackoverflow");
			return -1;
		}
		return i;
	}

	public int delElement() {
		if (i > 0) {
			obj[i] = null;
			i = i - 1;
		} else {
			obj[i] = null;
		}
		return i;
	}
public Object getLastElement() {
	return obj[i];
}
	@Override
	public String toString() {
		return "Stack [obj=" + Arrays.toString(obj) + "]";
	}

}
