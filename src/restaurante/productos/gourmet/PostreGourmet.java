package restaurante.productos.gourmet;

import restaurante.app.RandomUtil;
import restaurante.productos.Postre;

public class PostreGourmet implements Postre {

    private static final String[] OPCIONES = {
        "Creme brulee",
        "Cheesecake premium",
        "Tiramisu clásico",
        "Fondant de chocolate",
        "Panna cotta con frutos rojos"
    };

    @Override
    public String getNombre() {
        return OPCIONES[RandomUtil.nextInt(OPCIONES.length)];
    }
}
