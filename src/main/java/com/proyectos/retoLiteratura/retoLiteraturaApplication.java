package com.proyectos.retoLiteratura;

import com.proyectos.retoLiteratura.principal.Principal;
import com.proyectos.retoLiteratura.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class retoLiteraturaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(retoLiteraturaApplication.class, args);
	}

	@Autowired
	private MenuService menuService;

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(menuService);
		principal.EjecutarAplicacion();
	}
}
