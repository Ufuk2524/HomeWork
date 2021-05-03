package inheritanceHomeWork;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Ufuk");
		student1.setLastName("Olgun");
		student1.setEmail("ufuk.olgn@gmail.com");
		student1.setPassword("78564");
		student1.setMyCourses("C#, Java");
		student1.setCourseSchedule("Java 3.gün");
		student1.setHomework("Java 3. ders , ödev 2");
		student1.setCompletionRate(" % 50");
		student1.setEvaluation("Dýþarýda bulamacaðým bir kurs teþekkürler");

		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Ahmet");
		student2.setLastName("Korkmaz");
		student2.setEmail("ahmetkrkz@gmail.com");
		student2.setPassword("232114563");
		student2.setMyCourses(" C# ,Pyton");
		student2.setCourseSchedule("C# 2. gün");
		student2.setHomework("C# OOP ödevi 2");
		student2.setCompletionRate("%20");
		student2.setEvaluation("Çok güzel dersti");

		Student student3 = new Student();
		student3.setId(3);
		student3.setFirstName("Aykut");
		student3.setLastName("Çýnar");
		student3.setEmail("aykutcýnar@hotmail.com");
		student3.setMyCourses("C#");
		student3.setCourseSchedule("C# 15. gün");
		student3.setPassword("6331255");
		student3.setHomework("Cache, Transaction ve Performance");
		student3.setCompletionRate("%85");
		student3.setEvaluation("Ödevler zor ama faydalýydý");

		System.out.println(student1.getFirstName() + " " + student1.getLastName() + " " + student1.getEmail() + " "
				+ student1.getMyCourses() + "---" + student1.getCourseSchedule() + " " + student1.getHomework() + " "
				+ student1.getCompletionRate() + "----" + student1.getEvaluation());

		System.out.println(student2.getFirstName() + " " + student2.getLastName() + " " + student2.getEmail() + " "
				+ student2.getMyCourses() + "---" + student2.getCourseSchedule() + " " + student2.getHomework() + " "
				+ student2.getCompletionRate() + "----" + student2.getEvaluation());

		System.out.println(student3.getFirstName() + " " + student3.getLastName() + " " + student3.getEmail() + " "
				+ student3.getMyCourses() + "---" + student3.getCourseSchedule() + " " + student3.getHomework() + " "
				+ student3.getCompletionRate() + "----" + student3.getEvaluation());

		StudentManager studentManager = new StudentManager();
		studentManager.addWork(student1);
		studentManager.deleteWork(student2);
		studentManager.chooseCourse(student3);
		
		Student[] students = {student1,student2,student3};
        studentManager.addDuty(students);

		Instructor ýnstructor = new Instructor();
		ýnstructor.setId(1);
		ýnstructor.setFirstName("Engin");
		ýnstructor.setLastName("Demiroð");
		ýnstructor.setEmail("engindemirog@gmail.com");
		ýnstructor.setPassword("364515454");
		ýnstructor.setResume(" (MCT) ,PMP ve ITIL sertifikalarýna sahibim.");
		ýnstructor.setCourse("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");

		System.out.println(ýnstructor.getFirstName() + " " + ýnstructor.getLastName() + " " + ýnstructor.getResume()
				+ " " + ýnstructor.getCourse());

		InstructorManager ýnstructorManager = new InstructorManager();
		ýnstructorManager.addCourse(ýnstructor);
		ýnstructorManager.addDuty(student1);
		
		UserManager userManager = new UserManager();
		userManager.register(student1);
		userManager.login(student2);
		userManager.logout(student3);
		
		Logger[] loggers = {new EmailLogger(), new SmsLogger()};

	}

}
