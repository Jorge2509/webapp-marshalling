package org.jlsanchez.webapp.marshalling.view.xml;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.xml.MarshallingView;

@Component("listar.xml")
public class ClienteXmlView extends MarshallingView {

	@Autowired
	public ClienteXmlView(Jaxb2Marshaller marshaller) {
		super(marshaller);
	}

	

}
