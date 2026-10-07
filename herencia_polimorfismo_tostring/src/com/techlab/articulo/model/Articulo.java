package com.techlab.articulo.model;

abstract public class Articulo {
    private int codigo;
    private String nombre;
    private double precio;
    private Categoria categoria;

    public Articulo(int codigo, String nombre, double precio, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public abstract String getTipoArticulo();

    public abstract String getDetalleEspecifico();
/*
Sobrescribir el metodo toString() para devolver una representación legible del artículo,
incluyendo:
Código.
Nombre.
Precio.
Nombre de la categoría.
Tipo de artículo.
Detalle específico.
*/

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nNombre: " + nombre +
                "\nPrecio: " + precio +
                "\nCategoria: " + categoria +
                "\nTipo de artículo: " + getTipoArticulo() +
                "\nDetalle específico: " + getDetalleEspecifico();
    }
}
