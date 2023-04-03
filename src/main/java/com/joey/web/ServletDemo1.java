package com.joey.web;

import jakarta.servlet.*;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/demo1")
public class ServletDemo1 implements Servlet {


    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet Hello World~~!");
    }

    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }


    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
