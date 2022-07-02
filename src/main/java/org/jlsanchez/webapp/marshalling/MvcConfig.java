package org.jlsanchez.webapp.marshalling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
	@Bean
	public Jaxb2Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller marshaller= new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(new Class[] {org.jlsanchez.webapp.marshalling.view.xml.ClienteList.class});
		return marshaller;
	}

}
