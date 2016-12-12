package pluralsight.springcloud.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class ServiceConfig extends GlobalAuthenticationConfigurerAdapter {

  @Override
  public void init(AuthenticationManagerBuilder auth) throws Exception {
    // @formatter:off
    auth.inMemoryAuthentication()
      //.withUser("pluralsight").password("pluralsightsecret").roles("USER").and()
      .withUser("agoldberg").password("pass1").roles("USER").and()
      .withUser("bgoldberg").password("pass2").roles("USER", "OPERATOR");
    // @formatter:on

  }
}
