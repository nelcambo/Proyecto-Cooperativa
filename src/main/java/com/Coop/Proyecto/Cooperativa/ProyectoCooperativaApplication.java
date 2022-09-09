package com.Coop.Proyecto.Cooperativa;

import com.Coop.Proyecto.Cooperativa.entidades.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.metadata.TomcatDataSourcePoolMetadata;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.boot.jdbc.metadata.HikariDataSourcePoolMetadata;


@SpringBootApplication
public class ProyectoCooperativaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoCooperativaApplication.class, args);
	}

	Cliente cliente = new Cliente();
}


//Base de Datos Postgress
//Supabase
//DBCoopSpringBoot
//UMBvH3PuTQV8Ah2q
//Supabase
//Base de Datos Postgress
