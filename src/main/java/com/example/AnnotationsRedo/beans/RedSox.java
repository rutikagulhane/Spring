package com.example.AnnotationsRedo.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component("redSox")
public class RedSox implements ITeam{
    @Value("#{names.getName()}")
    private String name;
    @Value("#{T(com.example.AnnotationsRedo.beans.Scores).getNewScore()*10}")
    private int score;



    @Override
    public String getTeamName() {
        return name;
    }

    @Override
    public int getScore() {
        return score;
    }
}
