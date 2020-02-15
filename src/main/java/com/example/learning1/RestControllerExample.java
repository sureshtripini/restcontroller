package com.example.learning1;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {

	@GetMapping("/")
	public String welcomeMessage() {

		return "Welcome User !!!";
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(
				new Book(1, "Learn Spring Boot in 30 days", "Suresh Tripini"), new Book(2, "Learn Spring Boot in 60 days", "Suresh Tripini"));
	}

}
