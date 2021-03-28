package com.satya.CalculatorService;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;

@WebServlet("/sq")
public class SqrtService extends HttpServlet {


	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
//		HttpSession session = req.getSession();		
//		int k = (int)(session.getAttribute("k"));

		Cookie[] cookies = req.getCookies();
		int k = 0;
		
		for (Cookie c : cookies) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue()); 
			}
		}

		k = k*k;

		res.getWriter().println("sq called :"+k);
		
	}

}
