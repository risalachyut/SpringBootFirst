// need correction desktop class ko object dekhayeko xaina

package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {



		ApplicationContext context = SpringApplication.run(MyappApplication.class, args);
		Dev obj = context.getBean(Dev.class);

		obj.build();
	}

}
