package encapsulation;

public class main {
	
    public static void main(String[] args) {
    	
	employees e = new employees();
	
	System.out.println(e.getid());
	e.setname("neeha");
	System.out.println(e.getname());
	e.setGender('f');
	System.out.println(e.getGender());
			
	
	
	}

}
