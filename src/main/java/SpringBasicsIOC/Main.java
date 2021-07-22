package SpringBasicsIOC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MobileConfig.class);
        Mobile mobile = context.getBean("mobile", Mobile.class);
        System.out.println(mobile.receivedCall());
        Mobile mobile1=context.getBean("mobile",Mobile.class);
        System.out.println(mobile1.receivedCall());
        System.out.println(mobile);
        System.out.println(mobile1);


    }
}