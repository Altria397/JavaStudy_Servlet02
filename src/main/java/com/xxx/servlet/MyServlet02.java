package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: JavaStudy_Servlet
 * @description:
 * @author: Altria397
 * @create: 2023-09-13 11:01
 */

@WebServlet("/servlet2")
public class MyServlet02 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("初始化servlet02");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("处理myservlet02get请求");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理myservlet02post请求");
    }
}
