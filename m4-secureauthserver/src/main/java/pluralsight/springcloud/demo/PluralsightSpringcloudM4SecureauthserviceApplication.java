package pluralsight.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class PluralsightSpringcloudM4SecureauthserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(PluralsightSpringcloudM4SecureauthserviceApplication.class, args);
  }
}
