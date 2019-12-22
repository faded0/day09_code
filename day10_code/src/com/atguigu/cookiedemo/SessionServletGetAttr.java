package com.atguigu.cookiedemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServletGetAttr
 */
public class SessionServletGetAttr extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		// 获取Session的存活时间
		HttpSession session = request.getSession();
		
		//判断Session是否是新创建创建的
		response.getWriter().print(session.isNew()+"<br/>");
		//获取SessionId
		response.getWriter().print(session.getAttribute("sessionId")+"<br/>");
		//获取保存在Session中数据
		response.getWriter().print(session.getAttribute("sessionname"));
		
	}

}
