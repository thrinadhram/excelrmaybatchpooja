package inheritancepolymorphesim;

public class inheritancemainmethod {
	
public static void main(String[] args) {
	students s1 = new students();
	s1.attendinfsession();
	s1.deliveringproject();
	s1.playinggames();
	s1.lunchtime();
	s1.markattendance();
	
	teachers t1 = new teachers();
	t1.takingclass();
	t1.takingmotivationspeech();
	t1.lunchtime();
	t1.markattendance();
	
	staffclass st = new staffclass();
	st.claluclatingaccounts();
	st.processingsalary();
	st.lunchtime();
	st.markattendance();
	
	
}
		
		
	}


