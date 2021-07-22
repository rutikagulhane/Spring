package AutowireQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRun {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Human human = context.getBean("human", Human.class);
        human.test();
        context.getBean("heart",Heart.class).pump();

    }
}
