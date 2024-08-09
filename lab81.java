import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class lab81 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            out.println("Cookie already exists");
            for (Cookie cookie : cookies) {
                out.println("Name: " + cookie.getName() + ", Value: " + cookie.getValue());
            }
        } else {
            Cookie cookie = new Cookie("kalpesh", "firstname");
            cookie.setMaxAge(3600);
            response.addCookie(cookie);
            out.println("Cookie created Successfully");
        }
    }
}