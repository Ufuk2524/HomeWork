package inheritanceHomeWork;

public class UserManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Kodloma.io ya kayýt oldu");
	}

	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Giriþ yaptý");
	}

	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Çýkýþ yaptý");
	}

	public void addDuty(Student student) {

	}

}
