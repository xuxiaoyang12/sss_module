package com.mxiaixy.web;

import com.mxiaixy.pojo.User;
import com.mxiaixy.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Mxia on 2017/2/28.
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserService();
        User user = new User();
        user.setId(100);
        user.setName("rose");
        userService.saveUser(user);

        resp.sendRedirect("home.jsp");
    }
}
