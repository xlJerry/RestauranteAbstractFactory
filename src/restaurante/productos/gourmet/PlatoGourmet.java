package restaurante.productos.gourmet;

import restaurante.app.RandomUtil;
import restaurante.productos.PlatoPrincipal;

public class PlatoGourmet implements PlatoPrincipal {

    private static final String[] OPCIONES = {
        "Filete mignon en salsa de vino",
        "Ribeye a la parrilla con mantequilla de hierbas",
        "Salmon en salsa de eneldo",
        "Risotto de hongos porcini",
        "Pasta fresca con trufa"
    };

    @Override
    public String getNombre() {
        return OPCIONES[RandomUtil.nextInt(OPCIONES.length)];
    }
}
