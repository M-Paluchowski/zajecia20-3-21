package example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        java.io.PrintWriter writer = response.getWriter();
        writer.println("<h1> Cześć " + firstName + "</h1>");
        writer.println("<p> Wiem że masz na nazwisko " + lastName + "</p>");
        writer.println("<p> Też kiedyś miałem " + age + " lat </p>");
    }
}
