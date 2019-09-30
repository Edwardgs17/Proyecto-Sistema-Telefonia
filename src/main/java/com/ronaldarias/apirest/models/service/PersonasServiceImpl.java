package com.ronaldarias.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ronaldarias.apirest.models.dao.PersonasDAO;
import com.ronaldarias.apirest.models.entity.PersonasVO;

@Service
public class PersonasServiceImpl implements PersonasService {

	// need to inject customer DAO
	@Autowired
	private PersonasDAO personasDAO;

	@Override
	@Transactional(readOnly=true)
	public List<PersonasVO> getPersonas() {
		return (List<PersonasVO>) personasDAO.findAll();
	}

	@Override
	@Transactional
	public void savePersonas(PersonasVO miPersona) {

		personasDAO.save(miPersona);
	}

	@Override
	@Transactional(readOnly=true)
	public PersonasVO getPersona(Integer documento) {

		return personasDAO.findById(documento).get();
	}

	@Override
	@Transactional
	public void deletePersona(Integer documento) {

		personasDAO.deleteById(documento);
	}

}
