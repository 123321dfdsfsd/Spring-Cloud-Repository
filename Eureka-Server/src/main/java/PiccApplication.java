import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableEurekaServer
@SpringBootApplication
@ComponentScan(value={"com.flex.picc"})
public class PiccApplication {

    public static void main(String[] args) {
        SpringApplication.run(PiccApplication.class, args);
    }

}

