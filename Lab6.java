import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Lab6 extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
      
        HttpSession session=request.getSession();
        String sessionid=session.getId();
        out.println("the current Session Id:"+sessionid);
        String newurl=request.getRequestURL().toString()+"?sessionid="+sessionid;
        out.println("<p><a href="+newurl+"here</a> Click again to Continue Browsing with the same Identity</p>");
    }
}
