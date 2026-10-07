package com.techlab.articulo.model;

public class ArticuloElectronico extends Articulo{
    private int garantiaMeses;

    public ArticuloElectronico(int codigo, String nombre, double precio, Categoria categoria, int garantiaMeses) {
        super(codigo, nombre, precio, categoria);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String nroTelMesaDeAyudaParaReclamos(){
        return "0800-123-4567";
    }

    @Override
    public String getTipoArticulo() {
        return "Electrónico";
    }

    @Override
    public String getDetalleEspecifico() {
        return "Garantia de " + garantiaMeses + " meses";
    }
    @Override
    public String toString() {
        return super.toString() + "\n[subtipo electronico]";
    }
}
