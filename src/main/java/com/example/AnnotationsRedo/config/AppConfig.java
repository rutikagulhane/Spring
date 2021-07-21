package com.example.AnnotationsRedo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.example.AnnotationsRedo.beans")

public class AppConfig {

//    @Value("${home.name}") String homename;
//    @Value("${home.score}") int homescore;
//
//    @Value("${away.name}") String awayname;
//    @Value("${away.score}") int awayscore;
//
//    @Bean
//    public ITeam redSox()
//    {
//        return new RedSox( homename,homescore );
//    }
//    @Bean
//    public ITeam whiteSox()
//    {
//        return new WhiteSox(awayname,awayscore);
//
//    }
//
//    @Bean
//    public Game game()
//    {
//        return new Game(redSox(),whiteSox());
//    }

}
