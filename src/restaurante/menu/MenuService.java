package restaurante.menu;

import restaurante.factory.MenuFactory;

public class MenuService {
    private final MenuFactory factory;

    public MenuService(MenuFactory factory) {
        this.factory = factory;
    }

    public Menu crearMenuCompleto() {
        return new Menu(
                factory.crearEntrada(),
                factory.crearPlatoPrincipal(),
                factory.crearBebida(),
                factory.crearPostre()
        );
    }
}
