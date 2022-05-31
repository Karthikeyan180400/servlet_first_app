package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PersonDetails extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("personName");
		String email = req.getParameter("personEmail");
		String phone = req.getParameter("personNumber");
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");

		PrintWriter printWriter = res.getWriter();

		String htmlCode = "<html><body><h1>Name is " + name + "</h1><br><h1>Email is " + email
				+ "</h1><br><h1>Phone is " + phone + "</h1><br><h1>Gender is " + gender + "</h1><br><h1>Countrry is "
				+ country + "</h1></body></html>";

		printWriter.write(htmlCode);

	}

}
