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
public class PedidosController {

	@Autowired  
	PedidoServicio pedidoServicio;  
	   
	@GetMapping("/pedidos")  
	private List<Pedido> getAllPedidos()   
	{  
	   return pedidoServicio.getAllPedidos();  
	}  
	  
	@GetMapping("/pedido/{id}")  
	private Pedido getPedido(@PathVariable("id") int id)   
	{  
	   return pedidoServicio.getPedidoById(id);  
	}  
	  
	@DeleteMapping("/pedido/{id}")  
	private void deletePedido(@PathVariable("id") int id)   
	{  
	   pedidoServicio.delete(id);  
	}  
	  
	@PostMapping("/pedido")  
	private int savePedido(@RequestBody Pedido pedido)   
	{  
	   pedidoServicio.saveOrUpdate(pedido);  
	   return pedido.getId();  
	}  
	   
	@PutMapping("/pedido")  
	private Pedido update(@RequestBody Pedido pedido)   
	{  
	   pedidoServicio.saveOrUpdate(pedido);  
	   return pedido;  
	}
}
