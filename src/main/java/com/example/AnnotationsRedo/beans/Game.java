package com.example.AnnotationsRedo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Game {

    @Autowired
    @Qualifier("redSox")
    private ITeam home;


@Autowired
@Qualifier("whiteSox")
    private ITeam away;

//
//    public Game(ITeam home, ITeam away) {
//        this.home = home;
//        this.away = away;
//    }

    public void setHome(ITeam home) {
        this.home = home;
    }

    public void setAway(ITeam away) {
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
