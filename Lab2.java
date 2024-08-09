import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Lab2 extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        double num1=Double.parseDouble(request.getParameter("num1"));
        double num2=Double.parseDouble(request.getParameter("num2"));
        String op=request.getParameter("op");
        double result=0;

        if(op.equals("add"))
        {
            result=num1+num2;
        }
        else if(op.equals("sub"))
        {
            result=num1-num2;
        }
        else if(op.equals("mul"))
        {
            result=num1*num2;
        }
        else if(op.equals("div"))
        {
            if(num2==0)
            {
                out.println("Division by zero is not allowed");
            }
            else
            {
            result=num1/num2;
            }
        }
        out.println("result:"+result);
    }
}
