package com.proyectos.retoLiteratura.principal;

import com.proyectos.retoLiteratura.service.MenuService;
import com.proyectos.retoLiteratura.ui.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    private final MenuService menuService;

    @Autowired
    public Principal(MenuService menuService) {
        this.menuService = menuService;
    }

    public void EjecutarAplicacion() {
        Menu menu = new Menu();
        Scanner entrada = new Scanner(System.in);
        System.out.println(menu.getBienvenida());
        int opcion;
        do {
            try {
                System.out.print(menu.getMenu() + " ");
                opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        menuService.guardarLibro();
                        break;
                    case 2:
                        menuService.listarLibrosRegistrados();
                        break;
                    case 3:
                        menuService.listarAutoresRegistrados();
                        break;
                    case 4:
                        menuService.listarAutoresVivosEnAnio();
                        break;
                    case 5:
                        menuService.listarLibrosPorIdioma();
                        break;
                    case 0:
                        System.out.println("Saliendo del reto literatura Alura...");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: ingrese un número");
                opcion = -1;
                entrada.nextLine();
            }
        } while (opcion != 0);
        entrada.close();
    }
}


