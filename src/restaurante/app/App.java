package restaurante.app;

import java.util.Scanner;
import restaurante.factory.GourmetFactory;
import restaurante.factory.MenuFactory;
import restaurante.factory.SaludableFactory;
import restaurante.factory.VegetarianoFactory;
import restaurante.menu.Menu;
import restaurante.menu.MenuService;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MenuFactory factory = null;

        System.out.println("=== RESTAURANTE ===");
        System.out.println("Seleccione el tipo de menu:");
        System.out.println("1. Vegetariano");
        System.out.println("2. Gourmet");
        System.out.println("3. Saludable");
        System.out.println("0. Salir");

        int opcion = leerEntero(scanner);

        switch (opcion) {
            case 0:
                System.out.println("Saliendo del programa...");
                return;
            case 1:
                factory = new VegetarianoFactory();
                break;
            case 2:
                factory = new GourmetFactory();
                break;
            case 3:
                factory = new SaludableFactory();
                break;
            default:
                System.out.println("Opcion invalida");
                return;
        }

        // Crear menú automáticamente
        MenuService service = new MenuService(factory);
        Menu menu = service.crearMenuCompleto();
        
        menu.mostrarMenu();

        // Ahora el usuario decide qué consumir
        int eleccion;
        do {
            System.out.println("\n¿Que deseas consumir?");
            System.out.println("1. Entrada");
            System.out.println("2. Plato Principal");
            System.out.println("3. Bebida");
            System.out.println("4. Postre");
            System.out.println("0. Salir");

            eleccion = leerEntero(scanner);

            switch (eleccion) {
                case 1:
                    menu.consumirEntrada();
                    break;
                case 2:
                    menu.consumirPlatoPrincipal();
                    break;
                case 3:
                    menu.consumirBebida();
                    break;
                case 4:
                    menu.consumirPostre();
                    break;
            }

        } while (eleccion != 0);

        System.out.println("Gracias por visitar el restaurante️");
    }
    
    private static int leerEntero(Scanner sc) {
    while (!sc.hasNextInt()) {
        System.out.println("Ingrese un numero valido.");
        sc.next(); // descarta lo que escribieron (letras, etc.)
    }
    return sc.nextInt();
}

}
