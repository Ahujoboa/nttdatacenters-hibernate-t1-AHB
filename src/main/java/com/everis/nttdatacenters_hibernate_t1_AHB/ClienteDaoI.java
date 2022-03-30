package com.everis.nttdatacenters_hibernate_t1_AHB;

import java.util.List;

public interface ClienteDaoI {

	public List<Cliente> buscarClientes();

	public Cliente buscarClientePorNombre(String nombre);

}