package Homework;

public class InstructorManager implements UserManager {

	
	public void courseAdd() {
		System.out.println("Dersiniz sisteme eklenemiþtir");
	}

	@Override
	public void add(User user) {
		System.out.println("Eðitmen olarak eklendiniz");
		
	}
	
}
