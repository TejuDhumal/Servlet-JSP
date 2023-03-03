package com.example.demo.jspdemo2;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

@WebFilter("/HelloFilter")
public class HelloFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {

    }



    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;

        int id = Integer.parseInt(request.getParameter("id"));

        PrintWriter out = response.getWriter();
        if(id<1){
            out.println("invalid");

        }else {
          chain.doFilter(request,response);
        }

    }
}
