package com.xxx.servlet;

import com.xxx.entity.Emp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "MyServlet03", value = "/MyServlet03")
public class MyServlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
        //根据request获得客户端的请求数据
        //调用业务层，获得数据
        List<Emp> list = Arrays.asList(
                new Emp(1, "a01"),
                new Emp(2, "a02"),
                new Emp(3,"a03"));
        //list保存request或者session（转发或重定向）
        request.getSession().setAttribute("empList", list);
        //页面跳转
        response.sendRedirect(request.getContextPath() + "/page/emp.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("<title>标题</title>");
        out.write("</head>");
        out.write("<body>");
        out.write("<h1>页面内容</h1>");
        out.write("</body>");
        out.write("</html>");
    }
}
