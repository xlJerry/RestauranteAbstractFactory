package restaurante.productos.vegetariano;

import restaurante.app.RandomUtil;
import restaurante.productos.Postre;

public class PostreVegetariano implements Postre {

    private static final String[] OPCIONES = {
        "Ensalada de frutas tropicales",
        "Brownie de chocolate sin huevo",
        "Mousse de maracuya",
        "Helado artesanal de vainilla",
        "Tarta de manzana"
    };

    @Override
    public String getNombre() {
        return OPCIONES[RandomUtil.nextInt(OPCIONES.length)];
    }
}
