package com.ronaldarias.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ronaldarias.apirest.models.entity.EquiposVO;

public interface EquiposDAO extends CrudRepository<EquiposVO, Integer> {

}
