package com.wildringsfranco.app;

import com.wildringsfranco.dominio.MaquinaDispensadora;
import com.wildringsfranco.dominio.Producto;

import java.util.List;

public class App {
    public static void main(String[] args) {
        MaquinaDispensadora maquina = new MaquinaDispensadora();
        {

            Producto producto1 = new Producto("001", "Galletas wafer", (byte) 5000, (byte) 8);
            Producto producto2 = new Producto("002", "Chocolate milo", (byte) 10000, (byte) 1);
            Producto producto3 = new Producto("003", "Chosswiz", (byte) 15000, (byte) 4);
            Producto producto4 = new Producto("004", "Tridend", (byte) 12000, (byte) 5);
            Producto producto5 = new Producto("005", "Mani loco", (byte) 12000, (byte) 7);
            Producto producto6 = new Producto("006", "Confeti", (byte) 12000, (byte) 7);
            Producto producto7 = new Producto("007", "Papas de limon", (byte) 12000, (byte) 6);
            Producto producto8 = new Producto("008", "Malta", (byte) 12000, (byte) 8);
            Producto producto9 = new Producto("009", "Maizitos", (byte) 12000, (byte) 8);
            Producto producto10 = new Producto("010", "Vive100", (byte) 12000, (byte) 5);


            maquina.agregarProductoInventario("001", (byte) 1);
            maquina.agregarProductoInventario("002", (byte) 6);
            maquina.agregarProductoInventario("003", (byte) 1);
            maquina.agregarProductoInventario("005", (byte) 1);

            maquina.sacarProducto("005", 2000);
            maquina.sacarProducto("009", 8000);

            maquina.consultarProductosAgotados();

            maquina.consultarTotalUnidadesTodosProductos();
        }
    }
}
