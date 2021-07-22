package AutowireQualifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Heart implements IOrgan {

    @Value("#{T(AutowireQualifier.ColourProvider).colour().toLowerCase()}")
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
        System.out.println("colour is "+colour);

    }

    @Override
    public String organName() {
        return "Heart";
    }
}
