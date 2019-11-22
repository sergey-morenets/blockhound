package reactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.blockhound.BlockHound;

@SpringBootApplication
public class SampleWebFlux {

    public static void main(String[] args) {
        BlockHound.install();
        SpringApplication.run(SampleWebFlux.class, args);
    }
}
