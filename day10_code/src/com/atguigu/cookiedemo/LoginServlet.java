package com.atguigu.cookiedemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		 String username = request.getParameter("username");
		 String password=request.getParameter("password");
		 if(username.equals("AAA")&&password.equals("123456")) {
			 Cookie cookie=new Cookie("username",username);
			 cookie.setMaxAge(60*60);
			 response.addCookie(cookie);
			 System.out.println("创建完成,Cookie已经保存");
		 }else {
			 System.out.println("创建失败，Cookie无法保存");
		 }
		 
		 
		 
	}

}
