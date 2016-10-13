package com.richard.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity

/**
  * Created by highl on 13/10/2016.
  */
@Configuration
@EnableWebMvcSecurity
class SecurityConfig extends WebSecurityConfigurerAdapter{

    override def configure(authenticationManagerBuilder: AuthenticationManagerBuilder) : Unit ={
      authenticationManagerBuilder.inMemoryAuthentication()
        .withUser("richard").password("password").roles("USER")

  }

}
