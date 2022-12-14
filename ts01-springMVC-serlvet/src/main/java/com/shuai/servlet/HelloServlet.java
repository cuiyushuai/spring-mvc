package com.shuai.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Admin
 * @date 2022/10/13 13:01
 */
public class HelloServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String method = req.getParameter("method");
    if (method.equals("add")) {
      req.getSession().setAttribute("msg", "add方法");
    }
    if (method.equals("delete")) {
      req.getSession().setAttribute("msg", "delete方法");
    }

    req.getRequestDispatcher("/WEB-INF/test.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req, resp);
  }
}
