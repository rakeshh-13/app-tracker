package utils;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class APIServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		handleCall(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		handleCall(request, response);
	}
	
	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) {
		handleCall(request, response);
	}
	
	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) {
		handleCall(request, response);
	}
	
	public void handleCall(HttpServletRequest request, HttpServletResponse response) {
		
		String pathInfo = request.getPathInfo();
		
		try {
			response.getWriter().print("Got API call from " + pathInfo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
