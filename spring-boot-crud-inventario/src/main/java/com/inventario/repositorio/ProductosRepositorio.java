package com.inventario.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.inventario.model.*;

public interface ProductosRepositorio extends CrudRepository<Producto, Integer>{

}
