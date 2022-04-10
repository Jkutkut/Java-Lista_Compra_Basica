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

    public void removeProducto(int index){
        productos.remove(index);
    }

    // GETTERS
    public Producto getProducto(int index){
        return productos.get(index);
    }

    public int getSize(){
        return productos.size();
    }

    public boolean contains(Producto p){
        return productos.contains(p);
    }

    public Object[] getProductos(){
        return productos.toArray();
    }
}
