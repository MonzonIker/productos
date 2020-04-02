package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Estado;
import modelo.dao.ModeloEstado;
import modelo.bean.Descuento;
import modelo.dao.ModeloDescuento;
import modelo.bean.Talla;
import modelo.dao.ModeloTalla;

/**
 * Servlet implementation class FormInsertarProducto
 */
@WebServlet("/FormInsertarProducto")
public class FormInsertarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormInsertarProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ModeloEstado mE = new ModeloEstado();
		
		ArrayList<Estado> estados = mE.getAll();		
		
		request.setAttribute("estados", estados);
		
		ModeloDescuento mD = new ModeloDescuento();
		
		ArrayList<Descuento> descuentos = mD.getAll();		
		
		request.setAttribute("descuentos", descuentos);
		
		ModeloTalla mT = new ModeloTalla();
		
		ArrayList<Talla> tallas = mT.getAll();		
		
		request.setAttribute("tallas", tallas);
		
		request.getRequestDispatcher("InsertarProducto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
