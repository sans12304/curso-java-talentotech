package com.techlab.articulo;

import com.techlab.articulo.model.Articulo;
import com.techlab.articulo.model.Categoria;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // 4.2 - Precarga de categorias
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

    // 5 - Menu Principal
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

    // 6.1 - Ingresar Articulo
    public static void ingresarArticulo(Scanner scanner, ArrayList<Articulo> articulos, ArrayList<Categoria> categorias) {

    }

    // 6.2 - Listar Articulos
    public static void listarArticulos(ArrayList<Articulo> articulos) {
        if (articulos.isEmpty()) {
            System.out.println("La lista de articulos esta vacia.");
            return;
        }
        for (Articulo articulo : articulos) {
            System.out.println(articulo);
        }
    }

    // 6.3 - Consultar un articulo
    public static void consultarArticulo(Scanner scanner, ArrayList<Articulo> articulos) {
        if (articulos.isEmpty()) {
            System.out.println("La lista de articulos esta vacia.");
            return;
        }
        int codigo = leerEntero(scanner, "Escriba el codigo del articulo a consultar");
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo() == codigo) {
                System.out.println("¡Articulo encontrado!");
                System.out.println(articulo);
                System.out.println("- - - - - - - -");
            }
        }
        System.out.println("No se encontro el articulo.");
    }

    // 6.4 - Modificar un articulo
    public static void modificarArticulo(Scanner scanner, ArrayList<Articulo> articulos, ArrayList<Categoria> categorias) {

    }

    // 6.5 - Eliminar articulo
    public static void eliminarArticulo(Scanner scanner, ArrayList<Articulo> articulos) {

    }

    // 6.6 - Listar categorias
    public static void listarCategorias(ArrayList<Categoria> categorias) {

    }

    // 7.1 - Buscar articulo por codigo
    public static void buscarArticuloPorCodigo(ArrayList<Articulo> articulos, int codigo) {

    }

    // 7.2 - Buscar una categoria por codigo
    public static Categoria buscarCategoriaPorCodigo(ArrayList<Categoria> categorias, int codigo) {
        return null;
    }

    // 7.3 - Solicitar una categoria existente
    public static Categoria pedirCategoriaExistente(Scanner scanner, ArrayList<Categoria> categorias) {
        return null;
    }

    // 7.4 - Leer un numero entero
    public static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.println(mensaje);
            String entrada = scanner.nextLine();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("No se ingreso un numero valido, intente nuevamente.");
            }
        }
    }

    // 7.5 - Leer un entero no negativo
    public static int leerEnteroNoNegativo(Scanner scanner, String mensaje) {
        while (true) {
            int entrada = leerEntero(scanner, mensaje);
            if (entrada >= 0) {
                return entrada;
            } else {
                System.out.println("El numero ingresado es negativo. intente nuevamente");
            }
        }
    }

    // 7.6 - Leer un número decimal no negativo
    public static double leerDoubleNoNegativo(Scanner scanner, String mensaje) {
        while (true) {
            System.out.println(mensaje);
            String entrada = scanner.nextLine();
            try {
                if (Double.parseDouble(entrada) >= 0) {
                    return Double.parseDouble(entrada);
                } else {
                    System.out.println("Ingrese un numero mayor a 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero decimal valido.");
            }
        }
    }

    // 7.7 - Leer texto no vacio
    public static String leerTextoNoVacio(Scanner scanner, String mensaje) {
        while (true) {
            System.out.println(mensaje);
            String entrada = scanner.nextLine();
            if (entrada != null && !entrada.trim().isEmpty()) {
                return entrada;
            }
            System.out.println("Se introdujo texto vacio, intente nuevamente");
        }
    }

    void main(String[] args) {
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
                    listarArticulos(articulos);
                    break;
                case 3:
                    consultarArticulo(sc, articulos);
                    break;
                case 4:
                    modificarArticulo(sc, articulos, categoria);
                    break;
                case 5:
                    eliminarArticulo(sc, articulos);
                    break;
                case 6:
                    listarCategorias(categoria);
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

