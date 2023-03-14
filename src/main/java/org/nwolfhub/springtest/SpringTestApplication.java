package org.nwolfhub.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args); //start spring app
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class); //create context from Configuration.java
		Bucket bucket = (Bucket) context.getBean("bucket"); //get bucket bean
		System.out.println(bucket); //print its content
	}

}
