import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user_login")
public class LoginPage extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("This is my First Servlet.");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<center >");
        out.print("<h1>Welcome to Login page....</h1>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>");
        out.print("<login>");
        out.print("</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<form >");
        out.print("<center >");
        out.println("Enter Name : <input type = textname=name  >");
        out.print("<br >");
        out.print("<br >");
        out.println("Enter Password : <input type = password name = pass>");
        out.print("<br >");
        out.print("<br >");
        out.println("<input type = submit value = Login>");
        out.print("</form>");
        out.print("</body>");
        out.print("</html>");


    }
}