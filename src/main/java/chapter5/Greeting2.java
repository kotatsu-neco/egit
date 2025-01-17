package chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Page;

@WebServlet(urlPatterns = { "/chapter5/greeting2_response" })
public class Greeting2 extends HttpServlet {

	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("UTF-8");
		String user = request.getParameter("user");

		Page.header(out);
		out.println("<p>こんにちは、" + user + "さん！</p>");
		Page.footer(out);
	}

	public void doGet(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("UTF-8");
		String user = request.getParameter("user");

		Page.header(out);
		out.println("<p>こんばんは、" + user + "さん！</p>");
		Page.footer(out);
	}
}
