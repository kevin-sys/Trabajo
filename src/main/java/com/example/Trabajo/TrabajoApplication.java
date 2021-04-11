package com.example.Trabajo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@RestController
public class TrabajoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(TrabajoApplication.class, args);
    }

   // @GetMapping("/usuarios")
    // public String hello(@RequestParam(value = "name", defaultValue = "ilton sarnoso") String name) {
     //    return String.format("usuarios %s!", name);
    //}
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
            }
        };
    }
    
}
