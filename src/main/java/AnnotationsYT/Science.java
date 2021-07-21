package AnnotationsYT;

import org.springframework.stereotype.Component;

@Component
public class Science implements ITeacher{

    @Override
    public void teach() {
        System.out.println("SCIENCE");
    }
}
