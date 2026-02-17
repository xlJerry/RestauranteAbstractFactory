package restaurante.productos.vegetariano;

import restaurante.app.RandomUtil;
import restaurante.productos.Bebida;

public class BebidaVegetariana implements Bebida {

    private static final String[] OPCIONES = {
        "Limonada de hierbabuena",
        "Jugo natural de naranja",
        "Té helado de durazno",
        "Agua saborizada con frutos rojos",
        "Smoothie de mango"
    };

    @Override
    public String getNombre() {
        return OPCIONES[RandomUtil.nextInt(OPCIONES.length)];
    }
}
