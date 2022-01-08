package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("insdie input Servlet");
		
		String name = req.getParameter("name");
		String birthYear = req.getParameter("birthYear");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(birthYear);
		System.out.println(gender);
	}
	
	

	
}
