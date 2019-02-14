package ua.testov.test;

public class Main {

	public static void main(String[] args) {
		Stack st = new Stack();
		BlackList bl=new BlackList();
		bl.addToBlackList(Integer.class);
		bl.addToBlackList(String.class);
		System.out.println(bl);
		System.out.println(st.addElement(1,bl));
		System.out.println(st.addElement(2,bl));
		System.out.println(st.addElement(3,bl));
		System.out.println(st.addElement(4,bl));
		System.out.println(st.addElement(5,bl));	
		System.out.println(st.delElement());
		System.out.println(st.addElement(3.1,bl));
		System.out.println(st.addElement("sdf",bl));
		System.out.println(st.addElement(5,bl));
		System.out.println(st);
		System.out.println(st.getLastElement());
	}

}
