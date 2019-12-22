package com.atguigu.cookiedemo;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.utills.CookieUtils;
import com.sun.xml.internal.bind.v2.runtime.output.Encoded;

import sun.security.util.DerEncoder;

/**
 * Servlet implementation class CookieServlet
 */
public class CookieServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8"); 
		
		 /*Cookie cook=new Cookie("AAA","aaa");
		 
		 response.addCookie(cook);
		 Cookie[] cookies = request.getCookies();
		  if(cookies!=null) {
			 for (Cookie cookie : cookies) {
				System.out.println(cookie.getName());
			}
		 }
		 Cookie findCookie = CookieUtils.findCookie("AAA", cookies);
		 System.out.println(findCookie.getName());
		 response.getWriter().println("Cookie以及创建完成了");*/
		 
		 
		 //设置路径和用户名登录,使用中文会报错的
		 Cookie cookie=new Cookie("username","AAA");
		 response.addCookie(cookie);
		 //cookie.setPath("/day10_code/abc");
		 //cookie.setMaxAge(10);
		 //System.out.println("cookie路径 ："+cookie.getPath());
		 //查看Cookie是否被返回
		  Cookie[] cookies = request.getCookies();
	      Cookie findCookie = CookieUtils.findCookie("username", cookies);
	      System.out.println(findCookie);
		 response.getWriter().println("Cookie已经创建完成了");
		 
	}

	

}
