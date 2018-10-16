package org.baeldung.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ResourceConfigurer
 */
@Configuration
@EnableWebMvc
public class ResourceConfigurer implements WebMvcConfigurer{
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    System.out.println("******************* ADDDDDD");
  }
  
}