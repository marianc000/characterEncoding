package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/servlet7"})
public class Servlet7 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain; charset=utf-8");
        String data = request.getParameter("str");
        try ( PrintWriter out = response.getWriter()) {
            out.println("received: " + data);
            out.println("request charset: " + request.getCharacterEncoding());
        }
    }
}
