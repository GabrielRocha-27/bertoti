package br.com.rocha.spring_boot_lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLab3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLab3Application.class, args);
	}

}

// docker-compose up -d
// docker ps

// http://localhost:8080/swagger-ui/index.html (Swagger)
// http://localhost:8080/index.html (front-end)

// para visualizar o banco, usar o DBeaver