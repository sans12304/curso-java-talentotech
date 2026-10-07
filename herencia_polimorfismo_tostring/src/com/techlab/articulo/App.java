package com.techlab.articulo;

import com.techlab.articulo.model.Articulo;
import com.techlab.articulo.model.Categoria;

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void precargarCategorias(ArrayList<Categoria> categorias) {
        Categoria cat1 = new Categoria(1, "Electronica", "Productos tecnológicos y electrónicos");
        categorias.add(cat1);
        Categoria cat2 = new Categoria(2, "Periféricos", "Accesorios para computadora");
        categorias.add(cat2);
        Categoria cat3 = new Categoria(3, "Alimentos", "Productos alimenticios");
        categorias.add(cat3);
        Categoria cat4 = new Categoria(4, "Limpieza", "Artículos de limpieza del hogar");
        categorias.add(cat4);
    }

    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║                SISTEMA DE ARTÍCULOS                ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║                                                    ║");
        System.out.println("║   [ 1 ] Ingresar artículo                          ║");
        System.out.println("║   [ 2 ] Listar artículos                           ║");
        System.out.println("║   [ 3 ] Consultar un artículo                      ║");
        System.out.println("║   [ 4 ] Modificar un artículo                      ║");
        System.out.println("║   [ 5 ] Eliminar un artículo                       ║");
        System.out.println("║   [ 6 ] Listar categorías                          ║");
        System.out.println("║                                                    ║");
        System.out.println("║   [ 0 ] Salir                                      ║");
        System.out.println("║                                                    ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
        System.out.print("» Ingrese una opción: ");
    }

    public static void ingresarArticulo(Scanner scanner, ArrayList<Articulo> articulos, ArrayList<Categoria> categorias) {
        int opcion, codigo, garantiaMeses, diasVencimiento;
        String nombre;
        double precio;
        do {
            System.out.println("\n╔════════════════════════════════════════════════════╗");
            System.out.println("║                  INGRESAR ARTÍCULO                 ║");
            System.out.println("╠════════════════════════════════════════════════════╣");
            System.out.println("║                                                    ║");
            System.out.println("║   [ 1 ] Artículo electrónico                       ║");
            System.out.println("║   [ 2 ] Artículo alimenticio                       ║");
            System.out.println("║                                                    ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
            System.out.print("» Seleccione el tipo de artículo: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("\n» Ingrese el codigo del articulo.");
                    codigo = scanner.nextInt();
                    if (articulos.contains(codigo)) {
                        System.out.println("Ya existe un articulo con este codigo. Cancelando el ingreso.");
                        break;
                    }
                    System.out.print("\n» Ingrese el nombre del articulo.");
                    nombre = scanner.nextLine();
                    do {
                        System.out.println("El nombre del articulo no puede estar vacio, intente nuevamente.");
                        nombre = scanner.nextLine();
                    } while (nombre == "" | nombre == null);
                    System.out.print("\n» Ingrese el precio del articulo.");
                    precio = scanner.nextDouble();
                    do {
                        System.out.println("El precio del articulo no puede ser menor a $0, intente nuevamente.");
                        precio = scanner.nextDouble();
                    } while (precio < 0);
                    System.out.println("Categorias disponibles para asignar al articulo:");
                    for (Categoria categoria : categorias) {
                        System.out.println(categoria);
                    }
                    //articulos.add(new ArticuloElectronico(codigo, nombre, precio, , garantiaMeses));
                    break;
                case 2:
                    // articulos.add(new ArticuloAlimenticio(codigo, nombre, precio, , diasVencimiento));
                    break;
                default:
                    System.out.println("Opcion invalida, intente nuevamente.");
            }
        } while (opcion != 1 && opcion != 2);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Articulo> articulos = new ArrayList<>();
        ArrayList<Categoria> categoria = new ArrayList<>();
        precargarCategorias(categoria);

        int opcion;
        do {
            menu();
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    ingresarArticulo(sc, articulos, categoria);
                    break;
                case 2:
                    //TODO: listar
                    break;
                case 3:
                    //TODO: consultar
                    break;
                case 4:
                    //TODO: modificar
                    break;
                case 5:
                    //TODO: eliminar
                    break;
                case 6:
                    //TODO: listar categorías
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
