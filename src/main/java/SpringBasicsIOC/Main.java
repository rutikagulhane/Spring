package SpringBasicsIOC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MobileConfig.class);

        Mobile mobile = context.getBean("mobile", Mobile.class);
       // System.out.println(mobile.receivedCall());


       // System.out.println(mobile1.receivedCall());
        System.out.println(mobile);
        //singleton
//SpringBasicsIOC.Mobile@7f3b84b8
      //  SpringBasicsIOC.Mobile@7f3b84b8
//protype
        //SpringBasicsIOC.Mobile@5c33f1a9
       // SpringBasicsIOC.Mobile@36902638

        context.close();

    }
}