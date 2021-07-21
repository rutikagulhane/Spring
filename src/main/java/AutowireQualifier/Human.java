package AutowireQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Human {


    private IOrgan organ1;
    private IOrgan organ2;

    @Autowired
@Qualifier("brain")
    public void setOrgan1(IOrgan organ1) {
        this.organ1 = organ1;
    }
@Autowired
@Qualifier("heart")
    public void setOrgan2(IOrgan organ2) {
        this.organ2 = organ2;
    }

    public void test()
    {
       // heart.pump();
        System.out.println(organ1.organName());
        System.out.println(organ2.organName());
    }
}
