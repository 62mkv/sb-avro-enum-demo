package org.example;

import org.example.demo.Book;
import org.example.demo.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.main(args);
        var myValue = Book.JOURNAL;
    }
}
