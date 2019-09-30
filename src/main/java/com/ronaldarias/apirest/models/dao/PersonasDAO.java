package com.ronaldarias.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ronaldarias.apirest.models.entity.PersonasVO;

public interface PersonasDAO extends CrudRepository<PersonasVO, Integer> {

}
