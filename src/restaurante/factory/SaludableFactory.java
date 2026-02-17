package restaurante.factory;

import restaurante.productos.Bebida;
import restaurante.productos.Entrada;
import restaurante.productos.PlatoPrincipal;
import restaurante.productos.Postre;

import restaurante.productos.saludable.BebidaSaludable;
import restaurante.productos.saludable.EntradaSaludable;
import restaurante.productos.saludable.PlatoSaludable;
import restaurante.productos.saludable.PostreSaludable;

public class SaludableFactory implements MenuFactory {

    @Override
    public Entrada crearEntrada() {
        return new EntradaSaludable();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoSaludable();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaSaludable();
    }

    @Override
    public Postre crearPostre() {
        return new PostreSaludable();
    }
}
