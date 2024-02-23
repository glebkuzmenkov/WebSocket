package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@EnableWebMvc
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer, WebMvcConfigurer{

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // Настройка маршрутизации сокета
        registry.addHandler(new SocketTextHandler(), "/user/{name}").setAllowedOriginPatterns("*");

    }@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**")
                .addResourceLocations("classpath:/static/images/");
    }
///{name}
}
