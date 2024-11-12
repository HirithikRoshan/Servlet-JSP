// This is my first merge
package koli;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int a = Integer.parseInt(req.getParameter("num1"));
        int b = Integer.parseInt(req.getParameter("num2"));
        int ans = a + b;

        req.setAttribute("num", ans);
        RequestDispatcher rd = req.getRequestDispatcher("Sq");
        rd.forward(req, res);
    }
}
