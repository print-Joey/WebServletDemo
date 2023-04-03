package com.joey.web;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

/***
 * Servlet 方法介绍
 * 之getServletConfig()
 */
@WebServlet(value="/demo3",loadOnStartup = 1)
public class ServletDemo3 implements Servlet {
    private ServletConfig config;

    /**
     * 初始化方法
     * 1.调用时机: **默认情况下**(loadOnStartup == -1时),Servlet 被第一次访问时,init方法被调用
     *     1.1 如何修改调用的时机,换句话说,就是修改servlet创建的时机
     *          loadOnStartup:(0或正整数)时,服务器启动一次就会调用一次init();
     * 2.调用次数: 1次
     * @param servletConfig
     * @throws ServletException
     */
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("init");
    }

    /**
     * Service方法
     * 1.调用时机:每次Servlet被访问时,Service方法被调用
     * 2.调用次数: =Servlet被访问的次数
     * */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet Hello World~~!");
    }
    public ServletConfig getServletConfig() {
        return this.config;
    }


    public String getServletInfo() {
        return null;
    }


    /**
     * destroy()方法
     * 1.调用时机:内存被释放或者服务器关闭时,Servlet对象会被销毁,destroy方法被调用
     * 2.调用次数: 1次
     * */
    public void destroy() {

    }
}
