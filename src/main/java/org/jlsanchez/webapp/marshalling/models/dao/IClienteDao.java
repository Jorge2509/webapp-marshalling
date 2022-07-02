package org.jlsanchez.webapp.marshalling.models.dao;

import org.jlsanchez.webapp.marshalling.models.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {


}
