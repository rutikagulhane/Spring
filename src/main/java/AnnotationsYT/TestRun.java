package AnnotationsYT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRun {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
        College college=context.getBean("college",College.class);
        college.test();
        ((AnnotationConfigApplicationContext)context).close();


    }
}
