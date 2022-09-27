package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ezdesign.Ctxtst.Parrot;
import com.ezdesign.Ctxtst.Person;

import config.ProjectConfig;

public class Main {
	
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Person person = context.getBean(Person.class);
		
		Parrot parrot = context.getBean(Parrot.class);
		
		
		System.out.println("Person's name : " + person.getName());
		System.out.println("Parrot's name : " + parrot.getName());
		
		
		
	}

}
