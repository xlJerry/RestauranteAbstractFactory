package restaurante.app;

import java.util.Random;

public class RandomUtil {

    // Un solo Random para toda la aplicación
    private static final Random RANDOM = new Random();

    // Método público para obtener números aleatorios
    public static int nextInt(int limite) {
        return RANDOM.nextInt(limite);
    }
}
