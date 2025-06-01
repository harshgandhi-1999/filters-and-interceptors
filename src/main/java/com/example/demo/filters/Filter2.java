package com.example.demo.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class Filter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Inside Filter2");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Completed Filter2");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
