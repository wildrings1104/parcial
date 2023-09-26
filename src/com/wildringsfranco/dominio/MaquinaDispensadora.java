package com.wildringsfranco.dominio;

import java.util.ArrayList;
import java.util.List;

public class MaquinaDispensadora {
    private List<Producto> productosWF;

    public MaquinaDispensadora() {
        this.productosWF = new ArrayList<>();
    }

    public void agregarProductoWF(Producto producto1, Producto producto2, Producto producto3, Producto producto4, Producto producto5, Producto producto6, Producto producto7, Producto producto8, Producto producto9, Producto producto10) {

        productosWF.add(producto1);
        productosWF.add(producto2);
        productosWF.add(producto3);
        productosWF.add(producto4);
        productosWF.add(producto5);
        productosWF.add(producto6);
        productosWF.add(producto7);
        productosWF.add(producto8);
        productosWF.add(producto9);
        productosWF.add(producto10);
    }

    public void agregarProductoInventario(String codigoWF ,  byte cantidadWF) {
        boolean productoExiste = false;
        Producto producto = new Producto();
        for (Producto pdto : productosWF) {
            if (pdto.getCodigoWF().equals(codigoWF)) {
                productoExiste = true;
                producto = pdto;
            }
        }
        if (productoExiste) {
            if ((producto.getCantidadActual() + cantidadWF) > producto.getCantidadMaxima()) {
                producto.setCantidadActual((byte) 8);
            }
        } else {
            byte cantidadActual = (byte) (producto.getCantidadActual() + cantidadWF);
            producto.setCantidadActual(cantidadActual);
        }
    }


    public void sacarProducto(String nombreWF, int dineroWF) {
        boolean productoExiste = false;
        Producto producto = new Producto();
        for (Producto pdto : productosWF) {
            if (pdto.getNombreWF().equals(nombreWF)) {
                productoExiste = true;
                producto = pdto;
            }
        }
        if (productoExiste) {
            if (producto.getNombreWF().equals(nombreWF) &&
                    producto.getCantidadActual() > 0 &&
                    producto.getPrecioWF() <= dineroWF) {
                byte cantidadActual = (byte) (producto.getCantidadActual() - 1);
                producto.setCantidadActual(cantidadActual);
                System.out.println("Reciba su" + producto.getNombreWF() +
                        " su cambio es de: " + (dineroWF - producto.getPrecioWF()) +
                        " pesos");
            } else {
                System.out.println("El producto que selecciono no esta disponible, " + "su cambio es de: " + dineroWF + "pesos");

            }
        } else {
            System.out.println("Producto no disponible, " +
                    "su cambio es de: " + dineroWF + " pesos");
        }
    }
    public List<Producto> consultarProductosAgotados(){
        List<Producto> productosAgotados = new ArrayList<>();
        productosWF.forEach(producto -> {
            if(producto.getCantidadActual()==0){
                productosAgotados.add(producto);
            }
        });

        return productosAgotados;
    }
    public Producto consultarUnidadesUnProductos(String codigoWF){
        Producto pdto = new Producto();
        for (Producto producto: productosWF){
            if (producto.getCodigoWF().equals(codigoWF)){
                pdto = producto;
                break;
            }
        }
        return pdto;
    }
    public List<Producto> consultarTotalUnidadesTodosProductos(){
        List<Producto> inventarioTodosWF = new ArrayList<>();
        productosWF.forEach(producto -> {
            inventarioTodosWF.add(producto);
        });
        return inventarioTodosWF;
    }


    public void agregarProductoWF(Producto producto2) {
    }
}
