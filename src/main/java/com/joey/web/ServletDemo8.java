package com.joey.web;

// TomCat 10.0.27 Only support jakarta library
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ServletDemo8 - url pattern (目录匹配)
 *
 * @author Jiayu
 */
// Usage:http://localhost:8080/WebServletDemo/Demo8

@WebServlet(urlPatterns = {"/Demo8/*"})
public class ServletDemo8 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo8 .doget()...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post");
    }
}
