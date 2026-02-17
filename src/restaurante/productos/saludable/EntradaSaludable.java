package restaurante.productos.saludable;

import restaurante.app.RandomUtil;
import restaurante.productos.Entrada;

public class EntradaSaludable implements Entrada {

    private static final String[] OPCIONES = {
        "Crema ligera de calabaza",
        "Ensalada verde con semillas",
        "Sopa de vegetales",
        "Wrap de lechuga con pollo",
        "Ensalada de quinoa"
    };

    @Override
    public String getNombre() {
        return OPCIONES[RandomUtil.nextInt(OPCIONES.length)];
    }
}
