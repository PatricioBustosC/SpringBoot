package com.example.demo.repository;

import com.example.demo.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoRepository {

    private List<Producto> productos = new ArrayList<>();

    public ProductoRepository() {
        productos.add(new Producto(1, "Pastel de Chocolate", "Pastel húmedo con cobertura de cacao", 5000.0, "https://example.com/chocolate.png", 1));
        productos.add(new Producto(2, "Cheesecake", "Tarta de queso con base de galleta", 4500.0, "https://example.com/cheesecake.png", 1));
        productos.add(new Producto(3, "Pie de Limón", "Postre fresco con merengue", 4000.0, "https://example.com/pielimon.png", 1));
    }

    public List<Producto> findAll() {
        return productos;
    }
}
