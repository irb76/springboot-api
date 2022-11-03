package com.inventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	
			@Id  
			@Column  
			private int id;
			
			@Column  
			private String nombre;
			
			@Column  
			private int precio;
			
			
			public int getId()   
			{  
			   return id;  
			}
			
			public void setId(int id)   
			{  
			   this.id = id;  
			}  
			
			public String getNombre()  
			{  
			   return nombre;  
			}  
			
			public void setNombre(String nombre)   
			{  
			   this.nombre = nombre;  
			}  
			
			public int getPrecio()   
			{  
			   return precio;  
			}  
			
			public void setPrecio(int precio)   
			{  
			   this.precio = precio;  
			}  
}
