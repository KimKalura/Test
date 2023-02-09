package config;//package com.spring.ecommerce.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class BasicAuthSecurityConfig {
////autentificare user, parole; API key
////autorizate daca sunt admin am voie sa fac anumite lucruri, daca sunt client fac alte lucruri
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception { //clasa care se ocupa de autentificare
//        //ca AuthenticationManager sa faca autentificarea va tine cont de PasswordEncoder(BCryptPasswordEncoder())
//        return authenticationConfiguration.getAuthenticationManager();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder(); //e un algoritm care encodeaza o prl
//    }
//
//    @Bean
//    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
//        return http.csrf().disable()
//                .authorizeRequests()  //autorizam requesturi
//                .antMatchers("/category/**").permitAll()
//                .antMatchers(HttpMethod.POST, "/product/**").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .httpBasic()
//                .and()
//                .build();
//    }
//
//    //sessionCreationPolicy = spring security face sesiunea
//}
