package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import beans.Parrot;
import beans.Person;
import config.ProjectConfig;



@Configuration
@ComponentScan(basePackages = "beans")
public class Main {
	
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
	    Person p = context.getBean(Person.class);

		
		
		System.out.println("Person's name : " + p.getName());
		
		
		System.out.println("Person's Parrot : " +p.getParrot());
		
		
		
	}

}
