package Homework;

public class InstructorManager implements UserManager {

	
	public void courseAdd() {
		System.out.println("Dersiniz sisteme eklenemi�tir");
	}

	@Override
	public void add(User user) {
		System.out.println("E�itmen olarak eklendiniz");
		
	}
	
}
