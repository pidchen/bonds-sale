package com.ssm;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(value = "com.ssm")
public class Run implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		 Runtime.getRuntime().exec(
					"cmd   /c   start iexplore.exe  http://localhost:8080/api/user/1" );//chrome
	}

}
