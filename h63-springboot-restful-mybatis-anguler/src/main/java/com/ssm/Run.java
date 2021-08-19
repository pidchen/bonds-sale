package com.ssm;

import java.io.IOException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({ "com.ssm.mapper", "com.ssm.dao" })
public class Run {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(Run.class, args);
//		Runtime.getRuntime().exec(
//				"cmd   /c   start chrome.exe  http://localhost:8080/ssm/home.html");
		Runtime.getRuntime().exec(new String[]{"/usr/bin/open", "-a", "/Applications/Microsoft Edge.app", "http://localhost:8080" + "/ssm/home.html"});
	}

}
