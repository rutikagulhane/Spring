package SpringBasicsIOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Mobile {
    @Autowired
    @Qualifier("airtel")
    private Sim sim1;
    @Autowired
    @Qualifier("vodafone")
    private Sim sim2;


    public void setAirtel(Sim sim1) {
        this.sim1 = sim1;
    }

    public void setVodafone(Sim sim2) {
        this.sim2 = sim2;
    }

//    @Autowired
//    public Mobile(@Qualifier("airtel") Sim sim1, @Qualifier("vodafone")Sim sim2) {
//        this.sim1 = sim1;
//        this.sim2 = sim2;
//    }

    public Sim receivedCall()
    {
        return Math.random()*5>10?sim2:sim1;
    }
}
