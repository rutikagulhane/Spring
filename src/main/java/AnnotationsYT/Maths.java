package AnnotationsYT;

import org.springframework.stereotype.Component;

@Component

public class Maths implements ITeacher{

    @Override
    public void teach() {
        System.out.println("MATHSSSS");
    }
}
