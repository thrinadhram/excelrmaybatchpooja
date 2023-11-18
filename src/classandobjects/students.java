package classandobjects;

public class students {
	
	int id;
	String name;
	int rollno;
	int grade;
	char division;
	static String  schoolname = "excelr";

	
	public void attendinglectures() {
		System.out.println("students are aattending lectures");
		
	}
	public void doingexercisng() {
		System.out.println("students are doing exercising");
		
	}
	public static void main(String[] args) {
		students s1 = new students();
		s1.id = 1;
		s1.name = "pooja";
		s1.division = 'a';
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.division);
		s1.doingexercisng();
		System.out.println(students.schoolname);
		
		students s2 = new students();
		s2.id = 2;
		s2.name =" neeha";
		s2.division = '@';
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.division);
		s2.attendinglectures();
		System.out.println(students.schoolname);
	}

}
