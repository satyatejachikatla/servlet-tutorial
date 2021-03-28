package com.satya.CalculatorService;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.*;


public class PhoneDetailService extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.println("Hi");
		
		ServletContext ctx = getServletContext();
		String strPhone = ctx.getInitParameter("Phone");
		out.println(strPhone);

		ServletConfig cfg = getServletConfig();
		String strName = cfg.getInitParameter("Name");
		out.println(strName);
		
	}

}