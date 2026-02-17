package restaurante.productos.vegetariano;

import restaurante.app.RandomUtil;
import restaurante.productos.Entrada;

public class EntradaVegetariana implements Entrada {

    private static final String[] OPCIONES = {
        "Bruschetta de tomate y albahaca",
        "Hummus con bastones de zanahoria",
        "Ensalada caprese",
        "Rollitos de pepino con queso crema",
        "Tostadas integrales con aguacate"
    };

    @Override
    public String getNombre() {
        return OPCIONES[RandomUtil.nextInt(OPCIONES.length)];
    }
}
