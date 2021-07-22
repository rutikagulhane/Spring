package AutowireQualifier;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "AutowireQualifier")
@PropertySource("classpath:application.properties")

public class Config {

}
