package com.gini.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {
/**
 *
 * don't need this. All the configs are in the properties.yml file
 *
 * */

//
//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http){
//
//        http.authorizeExchange()
//                .pathMatchers("/actuator/**")
//                .permitAll()
//            .and()
//                .authorizeExchange()
//                .anyExchange()
//                .authenticated()
//            .and()
//                .oauth2Login(); //to redirect to oauth2 login page
//
//
//        return http.build();
//    }


}
