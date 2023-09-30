package com.pazbelloso.factura_springboot.models.service;

import com.pazbelloso.factura_springboot.models.dao.IClienteDao;
import com.pazbelloso.factura_springboot.models.entity.Cliente;
import com.pazbelloso.factura_springboot.models.entity.Factura;
import com.pazbelloso.factura_springboot.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    public Page<Cliente> findAll(Pageable pageable) {
        return clienteDao.findAll(pageable);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findOne(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteDao.deleteById(id);

    }

    @Override
    public List<Producto> findByNombre(String term) {
        return null;
    }

    @Override
    public void saveFactura(Factura factura) {

    }

    @Override
    public Producto findProductoById(long id) {
        return null;
    }

    @Override
    public Factura findFacturaById(Long id) {
        return null;
    }
}
