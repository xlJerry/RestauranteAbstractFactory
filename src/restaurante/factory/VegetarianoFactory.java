package restaurante.factory;

import restaurante.productos.Bebida;
import restaurante.productos.Entrada;
import restaurante.productos.PlatoPrincipal;
import restaurante.productos.Postre;

import restaurante.productos.vegetariano.BebidaVegetariana;
import restaurante.productos.vegetariano.EntradaVegetariana;
import restaurante.productos.vegetariano.PlatoVegetariano;
import restaurante.productos.vegetariano.PostreVegetariano;

public class VegetarianoFactory implements MenuFactory {

    @Override
    public Entrada crearEntrada() {
        return new EntradaVegetariana();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoVegetariano();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaVegetariana();
    }

    @Override
    public Postre crearPostre() {
        return new PostreVegetariano();
    }
}
