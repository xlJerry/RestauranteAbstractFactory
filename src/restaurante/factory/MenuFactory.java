package restaurante.factory;

import restaurante.productos.Bebida;
import restaurante.productos.Entrada;
import restaurante.productos.PlatoPrincipal;
import restaurante.productos.Postre;

public interface MenuFactory {
    Entrada crearEntrada();
    PlatoPrincipal crearPlatoPrincipal();
    Bebida crearBebida();
    Postre crearPostre();
}
