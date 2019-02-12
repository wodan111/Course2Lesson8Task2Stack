package ua.testov.test;

public class Main {

	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println(st.addElement(1));
		System.out.println(st.addElement(2));
		System.out.println(st.addElement(3));
		System.out.println(st.addElement(4));
		System.out.println(st.addElement(5));
		int x = st.delElement();
		System.out.println(x);
		System.out.println(st.addElement("sdf"));
		System.out.println(st.addElement(5));
		System.out.println(st);
		System.out.println(st.getLastElement());
	}

}
