package koli;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int num = (int) req.getAttribute("num");
        PrintWriter out = res.getWriter();
        out.println("New Servlet called " + num);
    }
}
