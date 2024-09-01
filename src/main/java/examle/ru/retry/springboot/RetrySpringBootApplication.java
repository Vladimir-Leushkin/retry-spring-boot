package examle.ru.retry.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class RetrySpringBootApplication {

  public static void main(String[] args) {
    SpringApplication.run(RetrySpringBootApplication.class, args);
  }

}
