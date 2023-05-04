package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serv")
public class PrimeiroServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String primeira = Optional.ofNullable(request.getParameter("primeira")).orElse("informe a banda na url");
		
		PrintWriter out = response.getWriter();
		
		out.write("<h1>");
		out.write("primeiro servlet");
		out.write("</h1>");
		out.write("<p>melhores bandas</p>");
		out.write("<ol>");
		out.write("<li>"+primeira+"</li>");
		out.write("<li>Paralamas do Sucesso</li>");
		out.write("<li>Pato Fu</li>");
		out.write("</ol>");
	}
   

}
