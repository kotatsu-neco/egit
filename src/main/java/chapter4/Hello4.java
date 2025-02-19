package chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Page;

@WebServlet(urlPatterns = { "/chapter4/hello4" })
public class Hello4 extends HttpServlet {
	public void doGet(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");

		PrintWriter out = response.getWriter();

		Page.header(out);

		out.println("<p>Hello!</p>");
		out.println("<p>こんにちははは</p>");
		out.println("<p>諸行無常と沙羅双樹</p>");
		out.println("<p>" + new java.util.Date() + "</p>");

		Page.footer(out);
	}
}
