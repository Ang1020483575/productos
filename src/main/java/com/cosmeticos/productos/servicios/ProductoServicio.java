package com.cosmeticos.productos.servicios;

import com.cosmeticos.productos.modelo.entidades.Producto;
import java.util.List;

public interface ProductoServicio {
    List<Producto> getTodosProductos();
    List<Producto> getTodosProductosManual();
}
