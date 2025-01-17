package chapter9;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Page;

@WebServlet(urlPatterns = { "/chapter9/include" })
public class Include extends HttpServlet {

	public void doGet(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		Page.header(out);
		request.getRequestDispatcher("include1.jsp").include(request, response);
		request.getRequestDispatcher("include2.jsp").include(request, response);
		request.getRequestDispatcher("include2.jsp").include(request, response);
		Page.footer(out);
	}
}
