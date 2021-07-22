package SpringBasicsIOC;

import org.springframework.stereotype.Component;

@Component
public class Vodafone implements Sim{
    @Override
    public String toString() {
        return "Vodafone{}";
    }

    @Override
    public void calling() {
        System.out.println("calling from vodafone");
    }
}
