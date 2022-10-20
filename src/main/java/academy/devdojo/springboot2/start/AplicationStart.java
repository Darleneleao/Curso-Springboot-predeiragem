package academy.devdojo.springboot2.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@EnableAutoConfiguration
@ComponentScan(basePackages = "academy.devdojo.springboot2")
public class AplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(AplicationStart.class,args);

    }


}
