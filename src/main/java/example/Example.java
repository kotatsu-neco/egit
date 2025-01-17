package example;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/example/example"})
public class Example extends HttpServlet {

	private int count = 0; // インスタンス変数は避ける

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int currentCount;

        synchronized(this) { // 同期化ブロックで保護
            count++;
            
            try {
    			Thread.sleep(3000);
    		} catch (InterruptedException e) {
    			// TODO 自動生成された catch ブロック
    			e.printStackTrace();
    		}
            
            currentCount = count;
        }
        response.getWriter().println("カウント: " + currentCount);
    }
	        
	
}

