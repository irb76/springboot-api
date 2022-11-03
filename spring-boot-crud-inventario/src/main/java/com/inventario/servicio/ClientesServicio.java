package com.inventario.servicio;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import com.inventario.model.*;
import com.inventario.repositorio.*;


@Service
public class ClientesServicio {

	@Autowired  
	ClientesRepositorio clientesrepositorio;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Cliente> getAllClientes()   
	{  
	   List<Cliente> clientes = new ArrayList<Cliente>();  
	   clientesrepositorio.findAll().forEach(cliente1 -> clientes.add(cliente1));  
	   return clientes;  
	}  
	
	//getting a specific record by using the method findById() of CrudRepository  
	public Cliente getClienteById(int id)   
	{  
	   return clientesrepositorio.findById(id).get();  
	}  
	
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Cliente cliente)   
	{  
	   clientesrepositorio.save(cliente);  
	}  
	
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
	   clientesrepositorio.deleteById(id);  
	}  
	
	//updating a record  
	public void update(Cliente cliente, int id)   
	{  
	   clientesrepositorio.save(cliente);  
	}  
}
