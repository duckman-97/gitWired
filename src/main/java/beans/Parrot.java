package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Parrot {
	private String name;
	

	
	public Parrot() {
		
	}
	
	/*
	@Autowired
	public Parrot(Person person) {
		this.person = person;
		
	}
	
	
	public Person getPerson(){
		return this.person;
	}
	*/
	
	
	@Override
	public String toString() {
		return "Parrot : " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
