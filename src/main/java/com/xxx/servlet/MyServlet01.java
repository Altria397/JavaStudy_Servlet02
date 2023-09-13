package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: JavaStudy_Servlet
 * @description:
 * @author: Altria397
 * @create: 2023-09-13 10:12
 */

public class MyServlet01 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("servlet初始化");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理get请求");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理post请求");
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
