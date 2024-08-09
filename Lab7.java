import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Lab7 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
HttpSession hs=request.getSession();
String sid=hs.getId();
try
{

out.println("<p>");
String requestURL=request.getRequestURL().toString();
out.println("<form method='GET' action='" + requestURL + "'>");
out.println("<input type='hidden' name='sid' value='" + sid + "'/>");
out.println("<input type='submit' value='Click Here'/>");
out.println("</form>");

}
catch(Exception e)
{
    e.printStackTrace();
}
}
}