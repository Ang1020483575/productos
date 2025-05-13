package com.cosmeticos.productos.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "productos")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    Long id_producto;
    @Column(name = "nombre")
    String nombre;
    @Column(name = "descripcion")
    String descripcion;
    @Column(name = "precio")
    Long precio;
    @Column(name = "stock")
    Long stock;
    @Column(name = "id_categoria")
    Long id_categoria;
    @Column(name = "id_proveedor")
    Long id_proveedor;
}

