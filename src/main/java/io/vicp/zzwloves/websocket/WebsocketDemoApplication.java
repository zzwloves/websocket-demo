package io.vicp.zzwloves.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class WebsocketDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketDemoApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WebsocketDemoApplication.class);
    }
}
