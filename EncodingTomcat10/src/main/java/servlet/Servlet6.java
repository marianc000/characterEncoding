package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/servlet6"})
public class Servlet6 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain; charset=utf-16");

        try ( PrintWriter out = response.getWriter()) {
            out.println("Утверждение о том, что пандемия");
            out.println("response charset: " + response.getCharacterEncoding());
        }
    }
}
