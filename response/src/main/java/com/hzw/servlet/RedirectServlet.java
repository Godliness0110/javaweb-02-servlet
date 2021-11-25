package com.hzw.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Godliness
 * @date 2021/9/22 13:54
 * @Description
 */
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /**
         * resp.setHeader("Location","/response_war/do");
         * resp.setStatus(302);
         *
         * 面试题：重定向和转发的区别：
         * 相同点：页面都会实现跳转
         * 不同点：转发在请求转发时，url不会产生变化
         *       重定向时候，url地址栏会发生变化；
         */
        resp.sendRedirect("/response_war/do");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
