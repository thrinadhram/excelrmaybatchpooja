package inheritancepolymorphesim;

public class methodoverloading {
	
	public void m1(int a,int b) {
		System.out.println("adding 3 int numbers");
		
	}
public void m2(int a,int b, int c) {
	System.out.println("adding 4 int numbers");
	
}
public void m3(float a, float b, float c) {
	System.out.println("adding 5 float numbers");
	
}
public static void main(String[] args) {
	methodoverloading p = new methodoverloading();
	p.m1(1, 2);
	p.m2(1, 2, 3);
	p.m3(1, 2, 3);
}
}
