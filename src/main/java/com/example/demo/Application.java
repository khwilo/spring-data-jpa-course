package com.example.demo;

import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
    return args -> {
      Student khwilo = new Student("Khwilo", "Kabaka", "khwilowatai@gmail.com", 27);
      studentRepository.save(khwilo);
    };
  }
}
