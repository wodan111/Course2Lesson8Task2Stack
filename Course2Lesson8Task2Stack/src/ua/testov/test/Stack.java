package ua.testov.test;

import java.util.Arrays;

public class Stack implements Cloneable {
	private Object[] obj = new Object[5];
	private int i = -1;

	public Stack() {
		super();
	}

	public int addElement(Object o,BlackList bl) {
		if (bl.check(o)==false && i < 4) {
			i = i + 1;
			obj[i] = o;
		} else {
			System.out.println("stackoverflow or forbidden type");
			return -1;
		}
		return i;
	}

	public Object delElement() {
		Object o = null;
		if (i > 0) {
			o = obj[i];
			obj[i] = null;
			i = i - 1;
		} else if (i == 0) {
			o = obj[i];
			obj[i] = null;
		}
		return o;
	}

	public int getIndexOfLastElement() {
		return i;
	}

	public Object getLastElement() {
		if(i==-1) {
			return -1;
		}
		return obj[i];
	}

	@Override
	public String toString() {
		return "Stack [obj=" + Arrays.toString(obj) + "]";
	}

}
