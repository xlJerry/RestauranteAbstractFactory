# Sistema de Menús de Restaurante - Patrón Abstract Factory

## Descripción
Este proyecto implementa el patrón de diseño **Abstract Factory** en Java.

El sistema permite generar automáticamente menús completos de restaurante garantizando coherencia entre sus componentes.

Cada menú contiene:
- Entrada
- Plato principal
- Bebida
- Postre

Los tipos de menú disponibles son:
- Vegetariano
- Gourmet
- Saludable

El usuario no selecciona cada plato individualmente; el sistema crea el menú automáticamente y el usuario decide qué elementos consumir.

## Patrón aplicado
Se utilizó el patrón **Abstract Factory**, donde:

- `MenuFactory` define la fábrica abstracta.
- `VegetarianoFactory`, `GourmetFactory` y `SaludableFactory` crean familias de productos compatibles.
- `Entrada`, `PlatoPrincipal`, `Bebida` y `Postre` son productos abstractos.
- `MenuService` genera el menú completo.
- `Menu` representa el conjunto de productos.

## Ejecución
Ejecutar la clase:

## Diagrama UML

![Diagrama UML](UML_AbstractFactory.png)



