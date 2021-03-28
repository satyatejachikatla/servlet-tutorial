package com.satya.CalculatorService;



import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/add")
public class AddService extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
//		HttpSession session = req.getSession(); 
//		session.setAttribute("k", k);

		Cookie kcookie = new Cookie("k",k+"");
		res.addCookie(kcookie);

		res.sendRedirect("sq");
		
	}

}
