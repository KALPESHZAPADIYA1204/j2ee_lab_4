import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Loginservlet extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        PrintWriter out=response.getWriter();
        String enm=request.getParameter("uname");
        String pass=request.getParameter("pass");
       
        if(enm.equals("kalpesh") && pass.equals("kalpesh123") && enm!=null && pass!=null)
        {
            out.println("Welcome"+enm);
            HttpSession s=request.getSession();
            s.setAttribute("Session",enm);
        }
        else
        {
            out.println("invalid login");
        }
    }
}