import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet
 {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {   
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    request.getRequestDispatcher("link.html").include(request, response);
    String name=request.getParameter("name");
    String password=request.getParameter("password");
        if(password.equals("kalpesh123")){
        out.print("Welcome, "+name);
    HttpSession session=request.getSession();
    session.setAttribute("name",name);
}
else
{
out.print("Sorry, username or password error!");
request.getRequestDispatcher("Login1.html").include(request, response);
}
out.close();
}
}