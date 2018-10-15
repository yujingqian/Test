package com.workit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class NoodlesServlet extends HttpServlet{
	private Logger logger = Logger.getLogger(NoodlesServlet.class);
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		logger.info("开始点菜了。。。");
		PrintWriter writer = response.getWriter();
		String vegetables  = request.getParameter("vegetables");
		if(vegetables ==null)
		{
			vegetables = "rose";
		}
		logger.info(vegetables);
		//String utf = "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />";
		writer.println("<html><body>");
		writer.println("<h1>vegetables with "+vegetables+"</h1>");
		writer.println("</body></html>");
		
		
	}
}
