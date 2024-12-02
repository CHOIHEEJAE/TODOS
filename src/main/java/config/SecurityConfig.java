package config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Slf4j
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.securityMatcher()
                .authorizeHttpRequests(
                        request -> request.requestMatchers("/").permitAll().anyRequest().authenticated())
                .formLogin(AbstractHttpConfigurer::disable);

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.builder().username("heejae").password("heejae").roles("ADMIN", "USER").build();

        return new InMemoryUserDetailsManager(user);
    }

    //    @Bean
    //    public PasswordEncoder passwordEncoder() {
    //        return new BCryptPasswordEncoder();
    //    }
}
