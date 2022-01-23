package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/servlet9"})
public class Servlet9 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/plain;charset=utf-8");

        String data = request.getReader().lines().collect(Collectors.joining());
        
        try ( PrintWriter out = response.getWriter()) {
            out.println("received: " + data);
        }
    }
}
