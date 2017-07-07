package com.archisoft.b2b;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;


@EnableSidecar

@SpringBootApplication
public class SidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SidecarApplication.class, args);
	}
	
	
    public void configure(HttpSecurity http) throws Exception {
        http
            .exceptionHandling()
            .authenticationEntryPoint((request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
        .and()
            .csrf()
            .disable()
            //.addFilterBefore(corsFilter, UsernamePasswordAuthenticationFilter.class)
            .headers()
            .frameOptions()
            .disable()
        .and()
            .sessionManagement()
           // .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
            .authorizeRequests()
//            .antMatchers("/api/register").permitAll()
//            .antMatchers("/api/activate").permitAll()
//            .antMatchers("/api/authenticate").permitAll()
//            .antMatchers("/api/account/reset_password/init").permitAll()
//            .antMatchers("/api/account/reset_password/finish").permitAll()
//            .antMatchers("/api/profile-info").permitAll()
            .antMatchers("/api/**").authenticated();
          
    }

}
