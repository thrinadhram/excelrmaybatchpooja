package javabasics;

public class strings {
	public static void main(String[] args) {
		String name = "neeha";
				System.out.println(name);
				name=name.concat("trainer");
				System.out.println("my name is "  + name  +".");
				System.out.println("neeha" + 10+10);
				System.out.println(10+10+"neeha");
				
				//literal//
				
				String s= "hi";
				String s1 = "bye";
				String s2= "hi";
				System.out.println(s);
				System.out.println(s1);
				System.out.println(s2);
				
				//keyword//
				
				String dp =  new String("java");
				String dp1 = new String("ohython");
				String dp2 = new String("java");
				System.out.println(dp);
				System.out.println(dp1);
				System.out.println(dp2);
				
				//string comparision//
				
				
				System.out.println(s==s2);
				System.out.println(s==s2);
				System.out.println(dp==dp2);
				System.out.println(dp==dp1);
				System.out.println(dp.equals(dp2));
				System.out.println(dp.equals(dp1));
				
				//mutuable//
				StringBuffer nh = new StringBuffer("hithika");
				System.out.println(nh);
				nh.append("neeha");
				System.out.println(nh);
				nh.append(true);
				System.out.println(nh);
				System.out.println(nh.capacity());
				System.out.println(nh.hashCode());
				System.out.println(nh.reverse());
				System.out.println(nh.length());
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
