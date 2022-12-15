import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {
    private int count = 0;

//    public void init(){
//        count = 0;
//    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        response.setContentType("text/html");
        count++;
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, World!</h1>" + "<h2>Number of times page viewed: " + count +"</h2>" + "Hello, " + request.getParameter( "name")+ "!");

    }
}
