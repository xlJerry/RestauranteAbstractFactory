package restaurante.productos.vegetariano;

import restaurante.app.RandomUtil;
import restaurante.productos.PlatoPrincipal;

public class PlatoVegetariano implements PlatoPrincipal {

    private static final String[] OPCIONES = {
        "Bowl de garbanzos y vegetales asados",
        "Lasaña de berenjena y espinaca",
        "Hamburguesa de lentejas con ensalada",
        "Tacos de champiñones al ajillo",
        "Pasta integral con pesto y tomate cherry"
    };

    @Override
    public String getNombre() {
        return OPCIONES[RandomUtil.nextInt(OPCIONES.length)];
    }
}
