package com.hzw.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @author Godliness
 * @date 2021/9/23 15:22
 * @Description
 */
public class CookieDemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        //Cookie服务器端从客户端获取
        Cookie[] cookies = req.getCookies();//这里返回数组，说明Cookie可能存在多个
        //判断Cookie是否存在
        if (cookies != null){
            //如果存在
            out.print("你上一次访问的时间是：");

            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                //获取Cookie的名字

                if (cookie.getName().equals("name")) {
                    //获取Cookie的值
//                    System.out.println(cookie.getValue());
                    out.print(cookie.getValue());
                }
            }
        }else {
            out.print("这是你第一次访问本站");
        }
        Cookie cookie = new Cookie("name","瘠薄");
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
