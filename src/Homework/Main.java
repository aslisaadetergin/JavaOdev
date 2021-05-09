package Homework;

public class Main {

	public static void main(String[] args) {
		
		Student user1 = new Student();
		user1.userId=1;
		user1.email="mailadres@gmail.com";
		user1.firstName="Asli Saadet";
		user1.lastName="Ergin";
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(user1);
		

	}

}
