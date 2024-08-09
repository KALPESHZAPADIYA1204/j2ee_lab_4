import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Lab10 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Set the content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Get the current session, create one if it doesn't exist
        HttpSession session = request.getSession(true);
        
        // Check if the session is new
        if (session.isNew()) {
            // First visit
            out.println("<h1>Welcome!</h1>");
            session.setAttribute("visited", "yes");
        } else {
            // Returning visit
            out.println("<h1>Welcome back!</h1>");
        }
        
        // Close the output writer
        out.close();
    }
}
