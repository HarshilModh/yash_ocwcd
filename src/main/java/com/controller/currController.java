package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class currController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int amn=Integer.parseInt(req.getParameter("inr"));
		int amonunt=0;
		String curr=req.getParameter("curr");
		switch(curr) {
		
		case "usd":
			amonunt=amn/73;
			break;
			
		case  "aud":
			amonunt=amn/55;
			break;
			
		case "pound":
			amonunt=amn/100;
			break;
		default:
			break;

		}
		
		req.setAttribute("convertedAmount", amonunt);
		
		RequestDispatcher rd= req.getRequestDispatcher("currConverter.jsp");
		rd.forward(req, resp);
			
						
	}
	
}
