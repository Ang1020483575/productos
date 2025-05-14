package com.cosmeticos.productos.modelo.repositorios;

import com.cosmeticos.productos.modelo.entidades.Producto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductoRepositorio extends Repository<Producto, Long> {
    List<Producto> findAll();

    @Query(value = "select * from cosmeticos.productos", nativeQuery = true)
    List<Producto> traerTodo();

}
