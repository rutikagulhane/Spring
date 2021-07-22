package AutowireQualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Human {


    private IOrgan organ1;



    private IOrgan organ2;

    public Human(@Qualifier("brain") IOrgan organ1, @Qualifier("heart")IOrgan organ2) {
        this.organ1 = organ1;
        this.organ2 = organ2;
    }

    public void test()
    {
       // heart.pump();
        System.out.println(organ1.organName());
        System.out.println(organ2.organName());

    }
}
