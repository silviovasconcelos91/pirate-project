package vasconcelos.silvio.pirateproject.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    UserDetailsManager userDetailsManager() {
        UserDetails silvioDetails = User.withDefaultPasswordEncoder().username("silvio").password("silvio").roles("USERS").build();
        return new InMemoryUserDetailsManager(silvioDetails);
    }
}
