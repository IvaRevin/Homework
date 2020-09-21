package homework.servlets;


import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;


public class SimpleServlet extends HttpServlet {
    private static String index = "/WEB-INF/view/index.jsp";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher(index).forward(request, response);
    }
}
