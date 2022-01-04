package com.widget.app.Comment_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.widget.app.Comment_App")
public class CommentApp {

	public static void main(String[] args) {
		SpringApplication.run(CommentApp.class, args);
	}

}
