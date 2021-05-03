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
		student1.setCourseSchedule("Java 3.g�n");
		student1.setHomework("Java 3. ders , �dev 2");
		student1.setCompletionRate(" % 50");
		student1.setEvaluation("D��ar�da bulamaca��m bir kurs te�ekk�rler");

		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Ahmet");
		student2.setLastName("Korkmaz");
		student2.setEmail("ahmetkrkz@gmail.com");
		student2.setPassword("232114563");
		student2.setMyCourses(" C# ,Pyton");
		student2.setCourseSchedule("C# 2. g�n");
		student2.setHomework("C# OOP �devi 2");
		student2.setCompletionRate("%20");
		student2.setEvaluation("�ok g�zel dersti");

		Student student3 = new Student();
		student3.setId(3);
		student3.setFirstName("Aykut");
		student3.setLastName("��nar");
		student3.setEmail("aykutc�nar@hotmail.com");
		student3.setMyCourses("C#");
		student3.setCourseSchedule("C# 15. g�n");
		student3.setPassword("6331255");
		student3.setHomework("Cache, Transaction ve Performance");
		student3.setCompletionRate("%85");
		student3.setEvaluation("�devler zor ama faydal�yd�");

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

		Instructor �nstructor = new Instructor();
		�nstructor.setId(1);
		�nstructor.setFirstName("Engin");
		�nstructor.setLastName("Demiro�");
		�nstructor.setEmail("engindemirog@gmail.com");
		�nstructor.setPassword("364515454");
		�nstructor.setResume(" (MCT) ,PMP ve ITIL sertifikalar�na sahibim.");
		�nstructor.setCourse("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");

		System.out.println(�nstructor.getFirstName() + " " + �nstructor.getLastName() + " " + �nstructor.getResume()
				+ " " + �nstructor.getCourse());

		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.addCourse(�nstructor);
		�nstructorManager.addDuty(student1);
		
		UserManager userManager = new UserManager();
		userManager.register(student1);
		userManager.login(student2);
		userManager.logout(student3);
		
		Logger[] loggers = {new EmailLogger(), new SmsLogger()};

	}

}
