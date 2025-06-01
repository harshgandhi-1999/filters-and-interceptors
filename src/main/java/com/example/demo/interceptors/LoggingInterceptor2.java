package com.example.demo.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoggingInterceptor2 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // if we return false here , the request will noe be proceeded to controller
        System.out.println("LoggingInterceptor2: {METHOD: PRE HANDLE} {DETAIL: " + request.getRequestURI() + "}");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("LoggingInterceptor2: {METHOD: POST HANDLE} {DETAIL: " + request.getRequestURI() + "}");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // Called after the complete request has finished, after the view has been rendered, and after the response has been sent to the client.
        System.out.println("LoggingInterceptor2: {METHOD: AFTER COMPLETION} {DETAIL: " + request.getRequestURI() + "}");
    }
}
