package classandobjects;



public class caluclator {
	
	int dp= 20;
	
	public static void main(String[] args) {
		int a =2;
		int b= 3;
		int c = a+b;
		System.out.println(c);
		caluclator c1 = new caluclator();
		c1.add();
		c1.sub();
		c1.mul();
	
		
	}
	
	public void add() {
		int abc = 5;
	
		System.out.println("adding2numbers");
		System.out.println(dp);
		
	}
	public void sub() {
		int x=4;
		int y=3;
		int z= x-y;
		System.out.println(dp);
		System.out.println("subtracting 2 numbers");
		System.out.println(z);
	}
	public void mul() {
		int x = 6;
		int y= 2;
		int z= x*y;
		System.out.println(z);
		
	}

}
