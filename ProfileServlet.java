import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ProfileServlet extends HttpServlet 
{
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    request.getRequestDispatcher("link.html").include(request, response);
    HttpSession session=request.getSession(false);


    if(session!=null){
    String name=(String)session.getAttribute("name");
    out.print("Hello, "+name+" Welcome to Profile");
}
else
{
out.print("Please login first");
request.getRequestDispatcher("Login1.html").include(request, response);
}
out.close();
}
}