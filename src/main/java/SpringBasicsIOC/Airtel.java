package SpringBasicsIOC;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim {
    @Override
    public String toString() {
        return "Airtel{}";
    }

    @Override
    public void calling() {
        System.out.println("calling from airtel");
    }
}
