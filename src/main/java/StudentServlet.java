import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Student Details</title></head>");
        out.println("<body>");

        out.println("<h1>Student Information</h1>");
        out.println("<p><b>Name:</b> Mohana</p>");
        out.println("<p><b>Branch:</b> Computer Science Engineering</p>");
        out.println("<p><b>Year:</b> 3rd Year</p>");
        out.println("<p><b>College:</b> GVPCEW</p>");

        out.println("</body>");
        out.println("</html>");
    }
}