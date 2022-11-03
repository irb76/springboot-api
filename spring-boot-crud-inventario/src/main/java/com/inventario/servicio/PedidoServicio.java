package com.inventario.servicio;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import com.inventario.model.*;
import com.inventario.repositorio.*;

@Service
public class PedidoServicio {

	@Autowired  
	PedidosRepositorio pedidosRepositorio;  
  
	public List<Pedido> getAllPedidos()   
	{  
	   List<Pedido> Pedidos = new ArrayList<Pedido>();  
	   pedidosRepositorio.findAll().forEach(pedido1 -> Pedidos.add(pedido1));  
	   return Pedidos;  
	}  
	  
	public Pedido getPedidoById(int id)   
	{  
	   return pedidosRepositorio.findById(id).get();  
	}  
	  
	public void saveOrUpdate(Pedido pedido)   
	{  
	   pedidosRepositorio.save(pedido);  
	}  
	  
	public void delete(int id)   
	{  
	   pedidosRepositorio.deleteById(id);  
	}  
	  
	public void update(Pedido pedido, int id)   
	{  
	   pedidosRepositorio.save(pedido);  
	}
}
