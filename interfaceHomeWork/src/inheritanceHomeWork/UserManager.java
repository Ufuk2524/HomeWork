package inheritanceHomeWork;

public class UserManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Kodloma.io ya kay�t oldu");
	}

	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Giri� yapt�");
	}

	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "��k�� yapt�");
	}

	public void addDuty(Student student) {

	}

}
