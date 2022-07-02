package org.jlsanchez.webapp.marshalling.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jlsanchez.webapp.marshalling.models.services.IClienteService;
import org.jlsanchez.webapp.marshalling.view.xml.ClienteList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClienteController {
	
	protected final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	private IClienteService clienteService;


	@RequestMapping(value = {"/listar", "/"}, method = RequestMethod.GET)
	public @ResponseBody ClienteList listar() {
		return new ClienteList(clienteService.findAll());
	}

	



}
