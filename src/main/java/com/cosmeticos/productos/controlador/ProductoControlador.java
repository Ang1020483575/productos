package com.cosmeticos.productos.controlador;

import com.cosmeticos.productos.modelo.entidades.Producto;
import com.cosmeticos.productos.servicios.ProductoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoControlador {
    private final ProductoServicio productoServicio;

    public ProductoControlador(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    //Primer Cambio
    @GetMapping("/productos")
    public List<Producto> getProductos() {
        return productoServicio.getTodosProductos();
    }

    @GetMapping("/productosManual")
    public List<Producto> getProductosManual() {
        return productoServicio.getTodosProductosManual();
    }

    @PostMapping("/insertarProducto")
    public String insertarUsuario(@RequestBody Producto producto) {
        productoServicio.insertarProducto(producto);
        return "Producto insertado correctamente";
    }
}