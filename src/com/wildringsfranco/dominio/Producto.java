package com.wildringsfranco.dominio;


public class Producto {

    private String codigoWF;
    private String nombreWF;
    private byte cantidadActual;
    private byte cantidadMaxima;
    private int precioWF;

    public Producto() {
    }

    public Producto(String codigoWF, String nombreWF, byte cantidadActual, byte cantidadMaxima) {
        this.codigoWF = codigoWF;
        this.nombreWF = nombreWF;
        this.cantidadActual = cantidadActual = 0;
        this.cantidadMaxima = cantidadMaxima = 8;
        this.precioWF = precioWF ;
    }

    public String getCodigoWF() {
        return codigoWF;
    }

    public String getNombreWF() {
        return nombreWF;
    }

    public byte getCantidadActual() {
        return cantidadActual;
    }

    public byte getCantidadMaxima() {
        return cantidadMaxima;
    }

    public int getPrecioWF() {
        return precioWF;
    }

    public void setCantidadActual(byte cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void setPrecioWF(int precioWF) {
        this.precioWF = precioWF;
    }
}
