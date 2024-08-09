
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Lab5 extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        
        PrintWriter out=response.getWriter();
        String  s1="kalpesh zapadiya";
        if(s1.length()==5)
        {
            out.println("String is equal to 5");
        }
        else
        {
            out.println("404:Page Not Found");
        }
    }
}