package constructor;

public class mainclass {
	public static void main(String[] args) {
		students s1 = new students(1,"pooja");
		s1.id = 1;
		s1.name= "pooj";
		s1.rollno=4;
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		students s2 = new students(2,"neeha",3);
		s2.id = 2;
		s2.name= "neeha";
	   
	    System.out.println(s2.id);
	    System.out.println(s2.name);
	    System.out.println(s2.rollno);
		
	}
		
	}


