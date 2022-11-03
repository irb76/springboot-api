package com.inventario.servicio;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import com.inventario.model.*;
import com.inventario.repositorio.*;

@Service
public class ProductoServicio {

	@Autowired  
	ProductosRepositorio productosRepositorio;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Producto> getAllProductos()   
	{  
	   List<Producto> Productos = new ArrayList<Producto>();  
	   productosRepositorio.findAll().forEach(producto1 -> Productos.add(producto1));  
	   return Productos;  
	}  
	
	//getting a specific record by using the method findById() of CrudRepository  
	public Producto getProductoById(int id)   
	{  
	   return productosRepositorio.findById(id).get();  
	}  
	
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Producto producto)   
	{  
	   productosRepositorio.save(producto);  
	}  
	
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
	   productosRepositorio.deleteById(id);  
	}  
	
	//updating a record  
	public void update(Producto producto, int id)   
	{  
	   productosRepositorio.save(producto);  
	}  
}
