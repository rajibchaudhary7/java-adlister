import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "PizzaServlet", urlPatterns= "/pizza")
public class PizzaServlet extends HttpServlet {
    @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza.jsp").forward(request, response);
        }
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String[] toppings = request.getParameterValues("toppings");
            for (String toppping: toppings){
                System.out.println(toppping);
            }
            System.out.println(request.getParameter("crust"));
            System.out.println(request.getParameter("size"));
            System.out.println(request.getParameter("sauce"));
            System.out.println(request.getParameter("address"));
        }
    }

