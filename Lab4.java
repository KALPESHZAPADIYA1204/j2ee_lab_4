import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Lab4 extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
       // response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String h=request.getHeader("User-agent");
        if(h.contains("MSIE"))
        {
            out.println("Browser use of the Internet Explorer");
        }
        else
        {
            response.sendRedirect("https://www.google.com/");
        }
    }
}
