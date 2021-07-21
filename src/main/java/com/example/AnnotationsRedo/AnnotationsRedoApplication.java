package com.example.AnnotationsRedo;

import com.example.AnnotationsRedo.beans.Game;
import com.example.AnnotationsRedo.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AnnotationsRedoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationsRedoApplication.class, args);

		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean("game", Game.class).playGame());
	}

}
