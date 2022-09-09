package com.Coop.Proyecto.Cooperativa.servicios;

import com.Coop.Proyecto.Cooperativa.entidades.Cliente;
import com.Coop.Proyecto.Cooperativa.repositorio.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServicioImpCliente implements ServicioCliente{
    @Autowired
    private RepositorioCliente repositorioCliente;

    @Override
    public List<Cliente> listarclientes() {
        return repositorioCliente.findAll();
    }

    @Override
    public Cliente guardarcliente(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public Cliente consultarClientesPorId(Integer documento) {
        return repositorioCliente.findById(documento).get();
    }

    @Override
    public Cliente actualizarClientes(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public void eliminarClientes(Integer documento) {
        repositorioCliente.deleteById(documento);
    }
}
