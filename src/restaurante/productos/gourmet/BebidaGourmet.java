package restaurante.productos.gourmet;

import restaurante.app.RandomUtil;
import restaurante.productos.Bebida;

public class BebidaGourmet implements Bebida {

    private static final String[] OPCIONES = {
        "Vino tinto reserva",
        "Vino blanco chardonnay",
        "Agua con gas importada",
        "Coctel sin alcohol de frutos rojos",
        "Café espresso"
    };

    @Override
    public String getNombre() {
        return OPCIONES[RandomUtil.nextInt(OPCIONES.length)];
    }
}
