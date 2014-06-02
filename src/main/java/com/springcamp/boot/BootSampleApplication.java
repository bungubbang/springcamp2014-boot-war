package com.springcamp.boot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 6/2/14
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class BootSampleApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootSampleApplication.class);
    }
}

@RestController
class HelloController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}