package javabasics;

public class datatypesconcersion {

	public static void main(String[] args) {
		byte b1 = 127;
		short s1 = b1;
		System.out.println(b1);
		System.out.println(s1);
		
		
		short s2 = 2345;
		int i1 = s2;
		System.out.println(s2);
		System.out.println(i1);
		
		int i2 = 23456;
		long l1 = i2;
		System.out.println(i2);
		System.out.println(l1);
		
		float f1 = 23.32f;
		double d1 = f1;
		System.out.println(f1);
		System.out.println(d1);
		
		
		char c1 = 'a';
		int i3 = c1;
		System.out.println(c1);
		System.out.println(i3);
		
		
		double  d2 = 234.345;
		int i4 = (int) d2;
		System.out.println(d2);
		System.out.println(i4);
		
		
		float f4 = 23.34f;
		int i5 = (int) f4;
		System.out.println(f4);
		System.out.println(i5);
		
		
		
		int i6 = 2349;
		char c2 = (char) i6;
		System.out.println(i6);
		System.out.println(c2);
				
				
		
		

	}

}
