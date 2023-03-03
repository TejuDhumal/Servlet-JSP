package com.example.demo.jspdemo2;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "HelloServlet", value = "/HelloServlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");

        out.println("hello" +name);

    }

    public void destroy() {
    }
}