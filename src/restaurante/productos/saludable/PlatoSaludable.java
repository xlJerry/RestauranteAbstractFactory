package restaurante.productos.saludable;

import restaurante.app.RandomUtil;
import restaurante.productos.PlatoPrincipal;

public class PlatoSaludable implements PlatoPrincipal {

    private static final String[] OPCIONES = {
        "Pollo a la plancha con quinoa y ensalada",
        "Pescado al horno con vegetales",
        "Pavo con arroz integral",
        "Ensalada proteica con atún",
        "Tazón saludable de pollo y aguacate"
    };

    @Override
    public String getNombre() {
        return OPCIONES[RandomUtil.nextInt(OPCIONES.length)];
    }
}
