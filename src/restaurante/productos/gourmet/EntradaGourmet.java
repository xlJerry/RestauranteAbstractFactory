package restaurante.productos.gourmet;

import restaurante.app.RandomUtil;
import restaurante.productos.Entrada;

public class EntradaGourmet implements Entrada {

    private static final String[] OPCIONES = {
        "Carpaccio de res con parmesano",
        "Tartar de salmon",
        "Foie gras con mermelada de frutos rojos",
        "Camarones al ajillo",
        "Bruschetta gourmet con prosciutto"
    };

    @Override
    public String getNombre() {
        return OPCIONES[RandomUtil.nextInt(OPCIONES.length)];
    }
}
