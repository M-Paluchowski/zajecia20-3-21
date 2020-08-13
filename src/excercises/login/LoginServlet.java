package excercises.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        java.io.PrintWriter writer = response.getWriter();

        if ("admin".equals(login) && "admin".equals(password)) {
            writer.println("<h1> Zalogowano pomyślnie </h1>");
        } else {
            writer.println("<h1> Niepoprawne dane logowania </h1>");
        }
    }
}
