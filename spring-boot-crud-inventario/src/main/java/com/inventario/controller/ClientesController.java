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
public class ClientesController {
  
		@Autowired  
		ClientesServicio clientesService;  
		
		//creating a get mapping that retrieves all the books detail from the database   
		@GetMapping("/clientes")  
		private List<Cliente> getAllClientes()   
		{  
		   return clientesService.getAllClientes();  
		}  
		
		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/cliente/{id}")  
		private Cliente getBooks(@PathVariable("id") int id)   
		{  
		   return clientesService.getClienteById(id);  
		}  
		
		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/cliente/{id}")  
		private void deleteCliente(@PathVariable("id") int id)   
		{  
		   clientesService.delete(id);  
		}  
		
		//creating post mapping that post the book detail in the database  
		@PostMapping("/cliente")  
		private int saveCliente(@RequestBody Cliente cliente)   
		{  
		   clientesService.saveOrUpdate(cliente);  
		   return cliente.getId();  
		}  
		
		//creating put mapping that updates the book detail   
		@PutMapping("/cliente")  
		private Cliente update(@RequestBody Cliente cliente)   
		{  
		   clientesService.saveOrUpdate(cliente);  
		   return cliente;  
		}  
}
