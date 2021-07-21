package com.example.AnnotationsRedo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Game {


    private ITeam home;



    private ITeam away;

@Autowired
    public Game(@Qualifier("redSox") ITeam home,@Qualifier("whiteSox") ITeam away) {
        this.home = home;
        this.away = away;
    }

    public ITeam playGame()
    {
        System.out.println("Winner is::" );
        return Math.random()*10>5 ? home : away;
    }

    @PostConstruct
    public String initMethod()
    {
        return "Start";
    }
    @PreDestroy
    public String destroyMethod()
    {
        return "OVER";
    }

}
