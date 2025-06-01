package com.example.demo.config;

import com.example.demo.interceptors.LoggingInterceptor1;
import com.example.demo.interceptors.LoggingInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private LoggingInterceptor1 loggingInterceptor1;

    @Autowired
    private LoggingInterceptor2 loggingInterceptor2;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // we can define order also for calling the interceptor in order

        registry.addInterceptor(loggingInterceptor1)
                .addPathPatterns("/api/**")
                .excludePathPatterns("/api/auth")
                .order(2);


        registry.addInterceptor(loggingInterceptor2)
                .addPathPatterns("/api/**")
                .excludePathPatterns("/api/auth")
                .order(1);
    }
}

