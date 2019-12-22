package com.atguigu.cookiedemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * Session的创建以及使用
 */
public class SessionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//获取Session
		/*
		 * 获取的方式一共有两种:
		 * getSession():如果没有就创建，如果有就直接返回
		 * getSession(boolean)：当它为true时，跟无参构造是一样的，如果为false，如果有就直接返回，没有就不创建了
		 */
		HttpSession session = request.getSession();
		//保存数据
		session .setAttribute("sessionname", "鲁智深");
		//更改session的存活方式：
		session.setMaxInactiveInterval(2*1000);
		//获取session的存活时间
		System.out.println(session.getMaxInactiveInterval());
		//保存SessionID
		session.setAttribute("sessionId", session.getId());
		response.getWriter().print("状态："+session.isNew());
		 
	}

}
