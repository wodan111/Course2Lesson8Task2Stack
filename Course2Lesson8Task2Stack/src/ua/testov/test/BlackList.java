package ua.testov.test;

import java.util.Arrays;

public class BlackList {
public Class[] c=new Class[10];
private int i = -1;

public BlackList() {
	super();
}
public int addToBlackList(Class obj) {
	if (i < 9) {
		i = i + 1;
		c[i] = obj;
	} else {
		System.out.println("stackoverflow");
		return -1;
	}
	return i;
}

public Object delFromBlackList() {
	Object o = null;
	if (i > 0) {
		o = c[i];
		c[i] = null;
		i = i - 1;
	} else if (i == 0) {
		o = c[i];
		c[i] = null;
	}
	return o;
}
public boolean check(Object obj) {
	for (int i = 0; i < c.length; i++) {
		if(c[i]==obj.getClass()) {
			return true;
		}
	}
	return false;
}
@Override
public String toString() {
	return "BlackList [c=" + Arrays.toString(c) + ", i=" + i + "]";
}

}
