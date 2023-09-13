package com.xxx.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.GenericDeclaration;

@WebServlet(name = "Servlet06", value = "/Servlet06")
public class MyServlet06 extends HttpServlet {
    String encoding = "gbk";

    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext context = config.getServletContext();
        encoding = context.getInitParameter("encoding");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (null != encoding) {
            request.setCharacterEncoding(encoding);
        }
        System.out.println(request.getParameter("name"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
