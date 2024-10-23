package com.login;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String uname = req.getParameter("user");
		String password = req.getParameter("pass");

		if (uname != null && uname.equals("sak") && (password != null && password.equals("suj"))) {
			HttpSession session = req.getSession();
			session.setAttribute("uname", uname);
			res.sendRedirect("welcome.jsp");
		} else {
			res.sendRedirect("login.jsp");
		}

	}
}
