package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/servlet11"})
public class Servlet11 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        String data = request.getReader().lines().collect(Collectors.joining());
        
        try ( PrintWriter out = response.getWriter()) {
            out.println("received: " + data);
        }
    }
}
