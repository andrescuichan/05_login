package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Main.Usuario;

/**
 * Servlet implementation class PrimerServlet
 */
@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int contador;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String nombre = request.getParameter("nombre");
		//String peso = request.getParameter("peso");
		//String edadNumber = request.getParameter("edadNumber");
		//String mensaje =  ": " + nombre + "," + peso + "," + edadNumber;
		
		String user_register = request.getParameter("Usuario");
		String pass_register = request.getParameter("pass");
		
		
		Usuario user1 = new Usuario("Irelia", "pass1");
		Usuario user2 = new Usuario("Fizz", "pass2");
		Usuario user3 = new Usuario("Pyke", "pass3");
		Usuario[] lista_usuarios = new Usuario[3];
		lista_usuarios[0] = user1;
		lista_usuarios[1] = user2;
		lista_usuarios[2] = user3;
		RequestDispatcher rd = request.getRequestDispatcher("ResultadoFormulario2.jsp");
		
		for(Usuario i: lista_usuarios){
		    if(user_register.equals(i.getUser())) {
		    	if(pass_register.equals(i.getPassword())) {
		    		RequestDispatcher rd2 = request.getRequestDispatcher("ResultadoFormulario.jsp");
		    		rd2.forward(request,response);
		    	}
		    }
		}
		
		//response.getWriter().append("SERVLET ESTAMOS EN GET " + ++contador + mensaje).append(request.getContextPath());
		//String sms = "mensaje desde el Servlet";
		//request.setAttribute("m1", sms);
		
		rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("SERVLET ESTAMOS EN POST" + ++contador).append(request.getContextPath());
		//doGet(request, response);
	}

}