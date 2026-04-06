import java.util.Scanner;

public class LoopCommerce { // Clase principal

    public static void main(String[] args) { // Crear un sistema de compras simple usando loops

        Scanner scanner = new Scanner(System.in); // Scanner para entrada de usuario

        System.out.println("=== BIENVENIDO A LOOPCOMMERCE ===");
        System.out.print("Ingresa el nombre del cliente: ");
        String cliente = scanner.nextLine();

        // Productos de computación
        String[] productos = {
            "Mouse inalámbrico Logitech",
            "Teclado mecánico Redragon",
            "SSD NVMe 500GB Kingston",
            "Memoria RAM 16GB DDR4",
            "Monitor 24 pulgadas Full HD",
            "Webcam Full HD"
        };

        int[] precios = {22000, 45000, 52000, 64990, 119990, 39990};

        int opcion; // Variable para almacenar la opción del usuario
        int productoSeleccionado;
        int cantidad;
        int subtotal = 0; // Variable para almacenar el subtotal de la compra
        int total = 0; // Variable para almacenar el total de la compra

        do {
            System.out.println("\n=== LOOPCOMMERCE ===");
            System.out.println("Cliente: " + cliente);
            System.out.println("1. Ver productos disponibles");
            System.out.println("2. Agregar producto al carrito de compras");
            System.out.println("3. Ver total subtotal");
            System.out.println("4. Simular pago");
            System.out.println("5. Salir");
            System.out.print("\nSelecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- PRODUCTOS DISPONIBLES ---");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i] + " CLP");
                    }
                    break;

                case 2:
                    System.out.println("\n--- AGREGAR PRODUCTO AL CARRITO ---");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i] + " CLP");
                    }

                    System.out.print("Selecciona el número del producto: ");
                    productoSeleccionado = scanner.nextInt();

                    if (productoSeleccionado >= 1 && productoSeleccionado <= productos.length) {
                        System.out.print("Ingresa la cantidad: ");
                        cantidad = scanner.nextInt();

                        subtotal = precios[productoSeleccionado - 1] * cantidad;
                        total += subtotal;

                        System.out.println("Agregaste: " + productos[productoSeleccionado - 1]);
                        System.out.println("Cantidad: " + cantidad);
                        System.out.println("Subtotal: $" + subtotal + " CLP");
                    } else {
                        System.out.println("Producto no válido.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- TOTAL DE LA COMPRA ---");
                    System.out.println("Subtotal acumulado: $" + total + " CLP");
                    break;

                case 4:
                    System.out.println("\n--- SIMULACIÓN DE PAGO ---");
                    if (total > 0) {
                        System.out.println("Cliente: " + cliente);
                        System.out.println("Total a pagar: $" + total + " CLP");
                        System.out.println("Pago realizado con éxito. ¡Gracias por tu compra!");
                        total = 0;
                    } else {
                        System.out.println("No hay productos en el carrito.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}