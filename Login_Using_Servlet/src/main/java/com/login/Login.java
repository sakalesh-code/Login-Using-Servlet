package com.login;

import java.io.IOException;
import java.sql.SQLException;

import com.loginDao.LoginDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uname = req.getParameter("user");
		String password = req.getParameter("pass");

		LoginDao dao = new LoginDao();

		try {
			if (dao.validate(uname, password)) {
//		if (uname != null && uname.equals("sak") && (password != null && password.equals("suj"))) {
				HttpSession session = req.getSession();
				session.setAttribute("uname", uname);
				res.sendRedirect("welcome.jsp");
			} else {
				res.sendRedirect("login.jsp");
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
