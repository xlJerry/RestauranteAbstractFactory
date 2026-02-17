package restaurante.productos.saludable;

import restaurante.app.RandomUtil;
import restaurante.productos.Bebida;

public class BebidaSaludable implements Bebida {

    private static final String[] OPCIONES = {
        "Te verde frio",
        "Agua con limon",
        "Infusion de jengibre",
        "Batido de banano",
        "Agua saborizada con pepino"
    };

    @Override
    public String getNombre() {
        return OPCIONES[RandomUtil.nextInt(OPCIONES.length)];
    }
}
