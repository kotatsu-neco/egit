package tool;

import java.io.PrintWriter;;

public class Page {
	public static void header(PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"ja\">");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		out.println("<title>Servlet/JSP Sample Programs</title>");
		out.println("</head>");
		out.println("<body>");
	}

	public static void footer(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}
}
