package com.example.AnnotationsRedo.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component("whiteSox")
public class WhiteSox implements ITeam {
    @Value("#{${testname}==true?${away.name}:'ownname'}")
    private String name;
    @Value("#{${away.score}+10}")
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
