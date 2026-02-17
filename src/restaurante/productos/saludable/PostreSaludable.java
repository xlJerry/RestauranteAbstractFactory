package restaurante.productos.saludable;

import restaurante.app.RandomUtil;
import restaurante.productos.Postre;

public class PostreSaludable implements Postre {

    private static final String[] OPCIONES = {
        "Yogur griego con granola",
        "Fruta con miel",
        "Gelatina light",
        "Avena con canela",
        "Mousse de yogur"
    };

    @Override
    public String getNombre() {
        return OPCIONES[RandomUtil.nextInt(OPCIONES.length)];
    }
}
