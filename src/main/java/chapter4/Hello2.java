package chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/chapter4/hello2" })
public class Hello2 extends HttpServlet {
	public void doGet(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain; charset = UTF-8");

		PrintWriter out = response.getWriter();
		out.println("Hello!");
		out.println("こんにちははは");
		out.println("諸行無常と沙羅双樹");
		out.println(new java.util.Date());
	}
}
