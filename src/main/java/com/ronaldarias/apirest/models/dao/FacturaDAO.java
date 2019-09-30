package com.ronaldarias.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ronaldarias.apirest.models.entity.FacturaVO;

public interface FacturaDAO extends CrudRepository<FacturaVO, Integer>{

}
