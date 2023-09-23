package com.pazbelloso.factura_springboot.models.service;

import com.pazbelloso.factura_springboot.models.dao.IClienteDao;
import com.pazbelloso.factura_springboot.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private IClienteDao clienteDao;

    @Override
    public List<Cliente> findAll() {
        return null;
    }

    @Override
    public Page<Cliente> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    public Cliente findOne(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
