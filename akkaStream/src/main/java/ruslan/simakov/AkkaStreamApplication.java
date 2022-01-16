package ruslan.simakov;

import akka.NotUsed;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.Source;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;

@SpringBootApplication
public class AkkaStreamApplication {

    public static void main(String[] args) {
//        SpringApplication.run(AkkaStreamApplication.class, args);

        Source<Integer, NotUsed> source = Source.range(1,200);
        Flow<Integer, BigInteger,NotUsed> flow;
    }

}
