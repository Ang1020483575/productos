package com.cosmeticos.productos.servicios.implementaciones;

import com.cosmeticos.productos.modelo.entidades.Producto;
import com.cosmeticos.productos.modelo.repositorios.ProductoRepositorio;
import com.cosmeticos.productos.servicios.ProductoServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductoImplementacionServicio implements ProductoServicio {

    private final ProductoRepositorio productoRepositorio;

    public ProductoImplementacionServicio(ProductoRepositorio productoRepositorio){
        this.productoRepositorio = productoRepositorio;
    }

    @Override
    public List<Producto> getTodosProductos() {
        return productoRepositorio.findAll();
    }

    @Override
    public List<Producto> getTodosProductosManual() {
        return productoRepositorio.traerTodo();
    }

    @Override
    public void insertarProducto(Producto pro) {
        productoRepositorio.insertarProducto(pro.getNombre(), pro.getDescripcion(), pro.getPrecio(), pro.getStock(), pro.getId_categoria(), pro.getId_proveedor());
    }

    @Override
    public void actualizarProducto(Producto pro){
        productoRepositorio.actualizarProducto(pro.getId_producto(), pro.getNombre(), pro.getDescripcion(), pro.getPrecio(), pro.getStock(), pro.getId_categoria(), pro.getId_proveedor());
    }

}
