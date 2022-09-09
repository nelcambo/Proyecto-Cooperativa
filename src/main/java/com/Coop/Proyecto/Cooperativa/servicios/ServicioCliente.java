package com.Coop.Proyecto.Cooperativa.servicios;

import com.Coop.Proyecto.Cooperativa.entidades.Cliente;

import java.util.List;

public interface ServicioCliente {
 public List<Cliente>listarclientes();
 public Cliente guardarcliente(Cliente cliente);
 public Cliente consultarClientesPorId(Integer documento);
 public Cliente actualizarClientes(Cliente cliente);
 public void eliminarClientes(Integer documento);






}
