import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Lab9 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Cookie[] cookies = request.getCookies();
        boolean isfirstvisit=true;
        for(Cookie cookie:cookies)
        {
            if(cookie.getName().equals("visited"))
            {
                isfirstvisit=false;
                break;
            }
        }
        if(isfirstvisit)
        {
            Cookie cookie = new Cookie("visited", "true");
            cookie.setMaxAge(31536000); // Set the cookie to expire in 1 year
            response.addCookie(cookie);
            out.println("Welcome!");
        }
        else
        {
            out.println("Welcome Back");
        }

    }
}
