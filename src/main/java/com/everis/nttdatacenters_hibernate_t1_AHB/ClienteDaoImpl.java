package com.everis.nttdatacenters_hibernate_t1_AHB;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class ClienteDaoImpl implements ClienteDaoI {

	private Session session;
	
	public ClienteDaoImpl(Session session) {
		this.session = session;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> buscarClientes() {
		List<Cliente> res = new ArrayList<Cliente>();
		//Verificamos la sesión abierta
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		return res = session.createQuery("FROM " + Cliente.class).list();
		
	}

	@Override
	public Cliente buscarClientePorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	

}