package AutowireQualifier;

import org.springframework.stereotype.Component;

@Component
public class Brain implements IOrgan{
    @Override
    public String organName() {
        return "BRAIN";
    }
}
