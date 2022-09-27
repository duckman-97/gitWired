package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import beans.Parrot;
import beans.Person;


@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {
	


}
