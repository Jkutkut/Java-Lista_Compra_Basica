package dam.model;

import java.util.ArrayList;

public class ListaCompra {
    private ArrayList<Producto> productos;

    public ListaCompra() {
        this.productos = new ArrayList<>();
    }

    // SETTERS
    public void addProducto(Producto p){
        productos.add(p);
    }

    public void removeProducto(Producto p){
        productos.remove(p);
    }

    // GETTERS
    public Producto getProducto(int index){
        return productos.get(index);
    }

    public int getSize(){
        return productos.size();
    }
}
