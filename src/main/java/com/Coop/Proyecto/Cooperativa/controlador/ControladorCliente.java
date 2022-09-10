package com.Coop.Proyecto.Cooperativa.controlador;

import com.Coop.Proyecto.Cooperativa.entidades.Cliente;
import com.Coop.Proyecto.Cooperativa.servicios.ServicioImpCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//@Controller
@RequestMapping("/cliente")
@RestController
public class ControladorCliente {

    @Autowired
    private ServicioImpCliente sic;
    @GetMapping
    public List<Cliente> listar(){
        return sic.listarclientes();
    }

}
