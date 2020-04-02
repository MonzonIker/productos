package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Producto;
import modelo.dao.ModeloProducto;

/**
 * Servlet implementation class InsertarProducto
 */
@WebServlet("/InsertarProducto")
public class InsertarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ModeloProducto mProducto = new ModeloProducto();		// crear un ojbeto de la clase Modelo Producto	
		// Recuperar mediante request.getParameter los valores del formulario
		Date fechaCompra = null;
		String nombre=request.getParameter("nombre");

		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			fechaCompra = formato.parse(request.getParameter("fechaCompra"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String color=request.getParameter("color");
		int stock=Integer.parseInt(request.getParameter("stock"));
		String made_in=request.getParameter("madein");
		Double precio=Double.parseDouble(request.getParameter("precio"));
		int descuento=Integer.parseInt(request.getParameter("descuento"));
		String tallas=request.getParameter("tallas");
		
		// crear una Producto con los datos del formulario	
		Producto producto=new Producto();
		producto.setNombre(nombre);
	    producto.setFecha_compra(fechaCompra);
	    producto.setColor(color);
	    producto.setStock(stock);
	    producto.setMade_in(made_in);
	    producto.setPrecio(precio);
	    producto.setDescuento(descuento);
	    producto.setTallas(tallas);
	    
	    //insertar Producto
		mProducto.insert(producto);				
		response.sendRedirect("VerProductos");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
