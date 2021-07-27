package SpringBasicsIOC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext(MobileConfig.class);

        Mobile mobile1=context1.getBean("mobile",Mobile.class);
        System.out.println(mobile1);
    }
}
