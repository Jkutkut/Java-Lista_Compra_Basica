package dam.model;

public class UnidadesProducto {
    public static final String KG = "Kg";
    public static final String G = "g";
    public static final String L = "l";
    public static final String UD = "unidades";

    private static final String[] UNIDADES = {KG, G, L, UD};

    public static String[] getUnidades(){
        return UNIDADES;
    }

    public static boolean isUnidad(String unidad){
        for (String un : getUnidades()) {
            if (un.equalsIgnoreCase(unidad)) {
                return true;
            }
        }
        return false;
    }
}
