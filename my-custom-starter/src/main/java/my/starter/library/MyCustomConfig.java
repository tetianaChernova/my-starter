package my.starter.library;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = MyCustomComponent.class)
public class MyCustomConfig {
}
