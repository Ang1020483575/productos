package com.cosmeticos.productos.controlador;

import com.cosmeticos.productos.modelo.entidades.Producto;
import com.cosmeticos.productos.servicios.ProductoServicio;
import org.springframework.web.bind.annotation.*;

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

    //Prueba Comentario
    @GetMapping("/productosManual")
    public List<Producto> getProductosManual() {
        return productoServicio.getTodosProductosManual();
    }

    @PostMapping("/insertarProducto")
    public String insertarProducto(@RequestBody Producto producto) {
        productoServicio.insertarProducto(producto);
        return "Producto insertado correctamente";
    }

    @PutMapping("/actualizarProducto")
    public  String actualizarProducto(@RequestBody Producto producto){
        productoServicio.actualizarProducto(producto);
        return  "Producto actualizado correctamente";
    }
}