package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ezdesign.Ctxtst.Parrot;
import com.ezdesign.Ctxtst.Person;

@Configuration
public class ProjectConfig {
	
	@Bean
	public Parrot parrot() {
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
				
		
	}
	
	
	@Bean
	
	public Person person() {
		Person p = new Person();
		p.setName("Elia");
		p.setParrot(parrot());
		return p;
		
	}

}
