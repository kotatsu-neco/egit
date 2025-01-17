package chapter12;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Page;

@WebServlet(urlPatterns = { "/chapter12/request2" })
public class Request2 extends HttpServlet {

	public void doGet(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);

		out.println("<p>Method<br>" + request.getMethod() + "</p>");
		out.println("<p>Request URI<br>" + request.getRequestURI() + "</p>");
		out.println("<p>Context Path<br>" + request.getContextPath() + "</p>");
		out.println("<p>Servlet Path<br>" + request.getServletPath() + "</p>");
		out.println("<p>Query String<br>" + request.getQueryString() + "</p>");
		out.println("<p>Protocol<br>" + request.getProtocol() + "</p>");

		out.println("<p>Request URL<br>" + request.getRequestURL() + "</p>");
		out.println("<p>Scheme<br>" + request.getScheme() + "</p>");
		out.println("<p>Server Name<br>" + request.getServerName() + "</p>");
		out.println("<p>Server Port<br>" + request.getServerPort() + "</p>");

		// URL情報を取得するメソッド
		out.println("<p>Request URL: " + request.getRequestURL() + "</p>");
		out.println("<p>Request Scheme: " + request.getScheme() + "</p>");
		out.println("<p>Server Name: " + request.getServerName() + "</p>");
		out.println("<p>Server Port: " + request.getServerPort() + "</p>");

		// リクエスト元の情報を取得するメソッド
		out.println("<p>Remote Addr: " + request.getRemoteAddr() + "</p>");
		out.println("<p>Remote Host: " + request.getRemoteHost() + "</p>");
		out.println("<p>Remote Port: " + request.getRemotePort() + "</p>");
		out.println("<p>Local Addr: " + request.getLocalAddr() + "</p>");
		out.println("<p>Local Name: " + request.getLocalName() + "</p>");
		out.println("<p>Local Port: " + request.getLocalPort() + "</p>");

		Page.footer(out);
	}
}
