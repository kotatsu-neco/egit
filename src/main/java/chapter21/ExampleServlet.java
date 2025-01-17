package chapter21;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/chapter21/example")
public class ExampleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // リクエストパラメータを設定
        request.setAttribute("paramExample", "サンプル値");

        // ヘッダー設定（手動追加）
        response.addHeader("Custom-Header", "HeaderValue");

        // クッキー設定
        Cookie cookie = new Cookie("testCookie", "cookieValue");
        response.addCookie(cookie);

        // スコープ変数設定
        request.setAttribute("requestScopeVar", "リクエストスコープの値");
        getServletContext().setAttribute("applicationScopeVar", "アプリケーションスコープの値");

        // フォワード
        request.getRequestDispatcher("/chapter21/example.jsp").forward(request, response);
    }
}
