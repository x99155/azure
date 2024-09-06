package com.lumumba.azure;

import com.lumumba.azure.entity.Student;
import com.lumumba.azure.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureApplication implements CommandLineRunner {

	private final StudentService studentService;

    public AzureApplication(StudentService studentService) {
        this.studentService = studentService;
    }

    public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Initialisation d'étudiants
		studentService.addStudent(new Student(null, "Boris", "E3", "Azure"));
		studentService.addStudent(new Student(null, "Malcolm", "E5", "Maths"));
		studentService.addStudent(new Student(null, "Juana", "E4", "CCNA"));
		studentService.addStudent(new Student(null, "Malik", "E2", "PHP"));
		studentService.addStudent(new Student(null, "Aaliyah", "E1", "Francais"));

	}
}
