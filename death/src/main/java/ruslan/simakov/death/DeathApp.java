package ruslan.simakov.death;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeathApp {
    public static void main(String[] args) {
        SpringApplication.run(DeathApp.class, args);
    }
}
