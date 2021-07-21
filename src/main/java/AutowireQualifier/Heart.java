package AutowireQualifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Heart implements IOrgan {

    @Value("${red}")
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void pump()
    {
        System.out.println("Heart is pumping");

    }

    @Override
    public String organName() {
        return "Heart";
    }
}
