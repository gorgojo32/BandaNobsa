/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bandasinfónicanobsa;

import java.util.Scanner;

/**
 *
 * @author jpber
 */
public class BandasinfónicaNobsa {
    public static void main(String[] args) {
        SistemaGestionPrestamos sistema = new SistemaGestionPrestamos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Sistema de Gestión de Préstamos de Instrumentos Musicales ---");
            System.out.println("1. Agregar instrumento");
            System.out.println("2. Solicitar préstamo");
            System.out.println("3. Registrar devolución");
            System.out.println("4. Listar instrumentos disponibles");
            System.out.println("5. Listar préstamos activos");
            System.out.println("6. Listar préstamos vencidos");
            System.out.println("7. Generar reporte de uso por grupo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Implementar lógica para agregar instrumento
                    break;
                case 2:
                    // Implementar lógica para solicitar préstamo
                    break;
                case 3:
                    // Implementar lógica para registrar devolución
                    break;
                case 4:
                    sistema.listarInstrumentosDisponibles().forEach(System.out::println);
                    break;
                case 5:
                    sistema.listarPrestamosActivos().forEach(System.out::println);
                    break;
                case 6:
                    sistema.listarPrestamosVencidos().forEach(System.out::println);
                    break;
                case 7:
                    sistema.generarReporteUsoPorGrupo().forEach((grupo, cantidad) ->
                            System.out.println(grupo + ": " + cantidad));
                    break;
                case 0:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
    
}
