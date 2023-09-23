package com.pazbelloso.factura_springboot.models.service;

import com.pazbelloso.factura_springboot.models.entity.Cliente;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ClienteService {
    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public void save(Cliente cliente);

    public Cliente findOne(Long id);

    public void delete(Long id);

}
