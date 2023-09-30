package com.pazbelloso.factura_springboot.models.dao;

import com.pazbelloso.factura_springboot.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura, Long> {


}
