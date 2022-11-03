package com.inventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id  
	@Column  
	private int id;
	
	@Column  
	private int clienteid;
	
	@Column  
	private int productoid;
	
	@Column  
	private int cantidad;
	
	public int getId()   
	{  
	   return id;  
	}
	
	public void setId(int id)   
	{  
	   this.id = id;  
	}  
	
	public int getIdCliente()  
	{  
	   return clienteid;  
	}  
	
	public void setIdCliente(int id)   
	{  
	   this.clienteid = id;  
	}  
	
	public int getIdProd()   
	{  
	   return productoid;  
	}  
	
	public void setIdProd(int id)   
	{  
	   this.productoid = id;  
	}
	
	public int getCantidad()   
	{  
	   return cantidad;  
	}  
	
	public void setCantidad(int cantidad)   
	{  
	   this.cantidad = cantidad;  
	}
}
