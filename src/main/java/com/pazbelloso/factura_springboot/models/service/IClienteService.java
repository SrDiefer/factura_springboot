package com.pazbelloso.factura_springboot.models.service;

import com.pazbelloso.factura_springboot.models.entity.Cliente;
import com.pazbelloso.factura_springboot.models.entity.Factura;
import com.pazbelloso.factura_springboot.models.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public void save(Cliente cliente);

    public Cliente findOne(Long id);

    public void delete(Long id);

    public  List<Producto> findByNombre(String term);

    public void saveFactura(Factura factura);

    public Producto findProductoById(long id);


    public Factura findFacturaById(Long id);

    public void deleteFactura(long id);
}
