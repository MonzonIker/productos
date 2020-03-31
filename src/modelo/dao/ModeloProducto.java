package modelo.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import java.sql.PreparedStatement;

import java.sql.Statement;
import java.sql.SQLException;

import modelo.Conector;
import modelo.bean.Producto;
import modelo.bean.Talla;

public class ModeloProducto extends Conector{

	public ArrayList<Producto> getAll() {
		//TODO implementar
		ArrayList<Producto> productos = new ArrayList<Producto>();
       
		try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select productos.* from productos ");
            while (rs.next()) {
                Producto producto = new Producto(rs.getInt("id"), rs.getString("nombre"), rs.getInt("stock"),
                        rs.getDate("fecha_compra"), rs.getString("color"), rs.getString("made_in"),
                        rs.getDouble("precio"), rs.getInt("descuento"));

                productos.add(producto);
             }
		}catch (SQLException e) {
            e.printStackTrace();
        }
           return productos;
	}
	
	public Producto get(int id) {
		//TODO implementar
		
		Producto producto = new Producto();
		
	       
		try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select productos.* from productos where id="+id);
            while (rs.next()) {
               producto.setId(rs.getInt("id"));
               producto.setNombre(rs.getString("nombre"));
               producto.setFecha_compra(rs.getDate("fecha_compra"));
               producto.setStock(rs.getInt("stock"));
               producto.setColor(rs.getString("color"));
               producto.setMade_in(rs.getString("made_in"));
               producto.setPrecio(rs.getDouble("precio"));
               producto.setDescuento(rs.getInt("descuento"));

               
             }
		}catch (SQLException e) {
            e.printStackTrace();
        }
           return producto;
	}
	
	public void insert(Producto p) {
		
		java.util.Date utilData = p.getFecha_compra();
		java.sql.Date sqlData = new java.sql.Date(utilData.getTime());
		try {
		 PreparedStatement pstInsert = conexion.prepareStatement("insert into productos (`nombre`, `stock`, `fecha_compra`, `color`, `made_in`, `precio`, `descuento`) values (?, ?, ?,?,?,?,?) ");
		 pstInsert.setString(1, p.getNombre());
		 pstInsert.setInt(2, p.getStock());
		 pstInsert.setDate(3, sqlData);
		 pstInsert.setString(4, p.getColor());
		 pstInsert.setString(5, p.getMade_in());
		 pstInsert.setDouble(6, p.getPrecio());
		 pstInsert.setInt(7, p.getDescuento());
		 
		 pstInsert.execute();
		}catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public void update(Producto producto) {
		//TODO implementar
	}
	
	public void delete(int id) {
		//TODO implementar
	}
	
	public ArrayList<Producto> deLaTalla(Talla talla){
		//TODO implementar, un poco mas dificil
		return null;
	}
}
