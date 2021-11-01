package com.example.demo;

import com.example.demo.controller.DT;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class DemoApplication {

	public static void main(String[] args) throws Exception {
		DT dt = new DT();
		dt.doid();
	}

}
