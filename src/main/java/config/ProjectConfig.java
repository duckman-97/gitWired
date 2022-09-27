package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import beans.Parrot;
import beans.Person;


@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {
	
	
	@Bean
	public Parrot parrot() {
		Parrot p = new Parrot();
		p.setName("koko");
		return p;
		
		
	}
	
	
	
	@Bean
	public Parrot parrot2() {
		Parrot p = new Parrot();
		p.setName("TATA");
		return p;
		
	}
	


}
