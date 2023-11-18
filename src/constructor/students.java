package constructor;

public class students {
	int id;
	String name;
	int rollno;
	char division;
	
	public students(int a, String b) {
		System.out.println("printing 2 parameters");
		
	}
		public students(int a,String b,int c) {
			System.out.println("printing 3 parameters");
		

}
		public students(int id, String name, int rollno, char division) {
			super();
			this.id = id;
			this.name = name;
			this.rollno = rollno;
			this.division = division;
		}
	
	
		
	
}

