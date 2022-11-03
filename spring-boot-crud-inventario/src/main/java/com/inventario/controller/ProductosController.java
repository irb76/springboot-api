package com.inventario.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.inventario.model.*;
import com.inventario.servicio.*;

@RestController
public class ProductosController {

	@Autowired  
	ProductoServicio productoService;  
	   
	@GetMapping("/productos")  
	private List<Producto> getAllProductos()   
	{  
	   return productoService.getAllProductos();  
	}  
	  
	@GetMapping("/producto/{id}")  
	private Producto getProductos(@PathVariable("id") int id)   
	{  
	   return productoService.getProductoById(id);  
	}  
	  
	@DeleteMapping("/producto/{id}")  
	private void deleteProducto(@PathVariable("id") int id)   
	{  
	   productoService.delete(id);  
	}  
	  
	@PostMapping("/producto")  
	private int saveProducto(@RequestBody Producto producto)   
	{  
	   productoService.saveOrUpdate(producto);  
	   return producto.getId();  
	}  
	   
	@PutMapping("/producto")  
	private Producto update(@RequestBody Producto producto)   
	{  
	   productoService.saveOrUpdate(producto);  
	   return producto;  
	}
}
