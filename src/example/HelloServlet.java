package example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    //http://localhost:8080/hello?parametr1=wartosc1&parametr2=wartosc2&strona=4

    //http://localhost:8080/hello?imie=Jan&nazwisko=Kowalski
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        String firstName = request.getParameter("imie");
        String lastName = request.getParameter("nazwisko");

        java.io.PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        writer.println("<h1>Hello " + firstName + " " + lastName+ "</h1>");
    }
}
