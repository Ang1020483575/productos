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

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO cosmeticos.productos (nombre, descripcion, precio, stock, id_categoria, id_proveedor) VALUES (:nombre, :descrip, :precio, :stock, :idCat, :idProv)", nativeQuery = true)
    void insertarProducto(String nombre, String descrip, Long precio, Long stock, Long idCat, Long idProv);

    @Modifying
    @Transactional
    @Query(value = "update cosmeticos.productos set nombre = :nombre, descripcion = :descripcion ,precio = :valor,stock = :inventario,id_categoria = :idcatg,id_proveedor = :idproved where id_producto = :idProd", nativeQuery = true)
    void actualizarProducto(Long idProd, String nombre, String descripcion, Long valor, Long inventario, Long idcatg, Long idproved);
}