package dam.model;

import dam.exception.InvalidDataException;
import dam.model.UnidadesProducto;

import java.util.Objects;

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
        if (nombre == null || nombre.isEmpty()) {
            throw new InvalidDataException("El nombre no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }

    private void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new InvalidDataException("La cantidad no puede ser negativa");
        }
        this.cantidad = cantidad;
    }

    private void setUnidad(String unidad) {
        if (!UnidadesProducto.isUnidad(unidad)) {
            throw new InvalidDataException("La unidad no es válida");
        }
        this.unidad = unidad;
    }

    // GETTERS

    @Override
    public String toString() {
        return String.format(
            "%s: %d %s",
            nombre, cantidad, unidad
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return  cantidad == producto.cantidad &&
                Objects.equals(nombre, producto.nombre) &&
                Objects.equals(unidad, producto.unidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cantidad, unidad);
    }
}
