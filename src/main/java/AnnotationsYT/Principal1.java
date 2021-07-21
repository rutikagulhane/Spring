package AnnotationsYT;

import org.springframework.stereotype.Component;

@Component
public class Principal1 {

   //private String name="absbds";

//    public Principal1(String name) {
//        this.name = name;
//    }


    @Override
    public String toString() {
        return "Principal1{}";
    }

    public void principalinfo()
    {
        System.out.println("Pricipal class");
        System.out.println("Name is ABC");
    }
}
