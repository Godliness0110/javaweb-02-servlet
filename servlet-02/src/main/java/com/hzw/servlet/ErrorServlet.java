package com.hzw.servlet;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Godliness
 * @date 2021/9/21 13:54
 * @Description
 */
public class ErrorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");

//        PrintWriter writer = resp.getWriter();
//        writer.print("何智武");

//        this.getInitParameter()  初始化参数
//        this.getServletConfig()  Servlet配置
//        this.getServletContext() Servlet上下文
        ServletContext context = this.getServletContext();//共享数据
        String userName = "何智武";
        context.setAttribute("userName",userName);//将一个数据保存在ServlerContext中
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}
