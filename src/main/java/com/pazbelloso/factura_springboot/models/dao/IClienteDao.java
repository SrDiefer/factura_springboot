package com.pazbelloso.factura_springboot.models.dao;

import com.pazbelloso.factura_springboot.models.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>, CrudRepository<Cliente, Long> {

}
