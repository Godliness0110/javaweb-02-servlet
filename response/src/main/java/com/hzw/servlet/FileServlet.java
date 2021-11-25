package com.hzw.servlet;

import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author Godliness
 * @date 2021/9/21 16:03
 * @Description
 */
public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String realPath = "F:\\ideaProject\\javaweb-02-servlet\\response\\target\\classes\\R-C.png";
        System.out.println("下载文件的路径"+realPath);
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        resp.setHeader("content-disposition","attachment;filename"+ URLEncoder.encode(fileName,"utf-8"));
        FileInputStream in = new FileInputStream(fileName);
        int len = 0;
        byte[] buffer = new byte[1024];
        ServletOutputStream out = resp.getOutputStream();
        while ((len = in.read(buffer))>0){
            out.write(buffer,0,len);
        }

        in.close();
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);

    }
}








//1.要获取下载文件的路径
//2.下载的文件名是什么
//3.设置想办法让浏览器能够支持（Content-Disposition）下载我们需要的东西
//4.获取下载文件的输入流
//5.创建缓冲区
//6.获取OutputStream对象
//7.将 FileOutputStream流写入到buffer缓冲区，使用OutputStream将缓冲区的数据输出到客户端