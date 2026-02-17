package restaurante.factory;

import restaurante.productos.Bebida;
import restaurante.productos.Entrada;
import restaurante.productos.PlatoPrincipal;
import restaurante.productos.Postre;

import restaurante.productos.gourmet.BebidaGourmet;
import restaurante.productos.gourmet.EntradaGourmet;
import restaurante.productos.gourmet.PlatoGourmet;
import restaurante.productos.gourmet.PostreGourmet;

public class GourmetFactory implements MenuFactory {

    @Override
    public Entrada crearEntrada() {
        return new EntradaGourmet();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoGourmet();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaGourmet();
    }

    @Override
    public Postre crearPostre() {
        return new PostreGourmet();
    }
}
