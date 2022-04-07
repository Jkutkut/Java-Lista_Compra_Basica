package dam.model;

import dam.model.UnidadesProducto;

public class Producto {

    private String nombre;
    private int cantidad;
    private String unidad;

    public Producto(String nombre, int cantidad, String unidad) {
        setNombre(nombre);
        setCantidad(cantidad);
        setUnidad(unidad);
    }

    // SETTERS
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setCantidad(int cantidad) {
        if (cantidad < 0) {
            
        }
        this.cantidad = cantidad;
    }

    private void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
