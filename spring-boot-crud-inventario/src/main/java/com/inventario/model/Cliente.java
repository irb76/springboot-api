package com.inventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
 
		@Id  
		@Column  
		private int id;
		
		@Column  
		private String nombre;
		
		@Column  
		private String ciudad;
		
		
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
		
		public String getCiudad()   
		{  
		   return ciudad;  
		}  
		
		public void setCiudad(String ciudad)   
		{  
		   this.ciudad = ciudad;  
		}  
}
