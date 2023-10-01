package com.pazbelloso.factura_springboot.models.service;

import com.pazbelloso.factura_springboot.models.dao.IClienteDao;
import com.pazbelloso.factura_springboot.models.dao.IFacturaDao;
import com.pazbelloso.factura_springboot.models.dao.IProductoDao;
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

    @Autowired
    private IFacturaDao facturaDao;

    @Autowired
    private IProductoDao productoDao;

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
    @Transactional
    public List<Producto> findByNombre(String term) {
        return productoDao.findByNombreLikeIgnoreCase("%" + term + "%");
    }

    @Override
    @Transactional
    public void saveFactura(Factura factura) {
        facturaDao.save(factura);

    }

    @Override
    @Transactional
    public Producto findProductoById(long id) {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Factura findFacturaById(Long id) {
        return facturaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteFactura(long id) {
        facturaDao.deleteById(id);

    }
}
