package com.example.demo.model;

public class Producto {

    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String imagenUrl;
    private int cantidad;

    public Producto(int id, String nombre, String descripcion, double precio, String imagenUrl, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagenUrl = imagenUrl;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    public String getImagenUrl() { return imagenUrl; }
    public int getCantidad() { return cantidad; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}
