package com.hzw.servlet;

import com.hzw.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Godliness
 * @date 2021/9/23 15:36
 * @Description
 */
public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //得到Session
        HttpSession session = req.getSession();
        //给Session中存东西
        session.setAttribute("name",new Person("jibo",1));
        //获取Session的ID
        String id = session.getId();
        //判断Session是不是新创建的
        if (session.isNew()){
            resp.getWriter().write("session创建成功，ID："+id);
        }else {
            resp.getWriter().write("session已经在服务器中存在了，ID："+id);
        }

        //Session创建时做了什么事情：

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
