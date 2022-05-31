package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("myPersonName");
		PrintWriter printWriter = res.getWriter();

		String htmlCOde = "<html><body><h1>Welcome " + name + "</h1></body></html>";
		
		printWriter.write(htmlCOde);

	}

}
