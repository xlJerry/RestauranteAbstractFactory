package restaurante.menu;

import restaurante.productos.Bebida;
import restaurante.productos.Entrada;
import restaurante.productos.PlatoPrincipal;
import restaurante.productos.Postre;

public class Menu {
    private final Entrada entrada;
    private final PlatoPrincipal platoPrincipal;
    private final Bebida bebida;
    private final Postre postre;

    public Menu(Entrada entrada, PlatoPrincipal platoPrincipal, Bebida bebida, Postre postre) {
        this.entrada = entrada;
        this.platoPrincipal = platoPrincipal;
        this.bebida = bebida;
        this.postre = postre;
    }

    public Entrada getEntrada() { return entrada; }
    public PlatoPrincipal getPlatoPrincipal() { return platoPrincipal; }
    public Bebida getBebida() { return bebida; }
    public Postre getPostre() { return postre; }
    
    public void mostrarMenu() {
    System.out.println("\n--- Menu generado automaticamente ---");
    System.out.println("Entrada: " + entrada.getNombre());
    System.out.println("Plato principal: " + platoPrincipal.getNombre());
    System.out.println("Bebida: " + bebida.getNombre());
    System.out.println("Postre: " + postre.getNombre());
}


    // El usuario decide qué consumir (puedes llamar estos métodos según su elección)
    public void consumirEntrada() {
        System.out.println("Consumiste la entrada: " + entrada.getNombre());
    }

    public void consumirPlatoPrincipal() {
        System.out.println("Consumiste el plato principal: " + platoPrincipal.getNombre());
    }

    public void consumirBebida() {
        System.out.println("Consumiste la bebida: " + bebida.getNombre());
    }

    public void consumirPostre() {
        System.out.println("Consumiste el postre: " + postre.getNombre());
    }
}
