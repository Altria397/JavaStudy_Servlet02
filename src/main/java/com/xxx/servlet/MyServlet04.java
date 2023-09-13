package com.xxx.servlet;

import com.xxx.entity.Emp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MyServlet04", value = "/empInfo.a")
public class MyServlet04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = request.getParameter("empno");
        if (null == str || "".equals(str.trim()) || !str.matches("\\d*")) {
            response.sendRedirect(request.getContextPath() + "/page/emp.jsp");
        } else {
            Integer empno = Integer.parseInt(str);
            //执行业务
            Emp emp = new Emp(empno, "aAa");
            request.getSession().setAttribute("emp", emp);
            //页面跳转
            response.sendRedirect(request.getContextPath() + "/page/empInfo.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
