package web.boardView.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ModifyProBean implements SuperBean{
	
	@Override
	public String actionBean(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		return "/WEB-INF/boardView/modifyPro.jsp";
	}
}
