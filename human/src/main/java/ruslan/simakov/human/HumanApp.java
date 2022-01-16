package ruslan.simakov.human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HumanApp {
    public static void main(String[] args) {
        SpringApplication.run(HumanApp.class, args);
    }
}
