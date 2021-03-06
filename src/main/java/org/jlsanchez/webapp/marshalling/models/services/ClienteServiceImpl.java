package org.jlsanchez.webapp.marshalling.models.services;

import java.util.List;

import org.jlsanchez.webapp.marshalling.models.dao.IClienteDao;
import org.jlsanchez.webapp.marshalling.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	

	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	
	
	
}
