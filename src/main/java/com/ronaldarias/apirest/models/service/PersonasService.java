package com.ronaldarias.apirest.models.service;

import java.util.List;

import com.ronaldarias.apirest.models.entity.PersonasVO;

public interface PersonasService {
	
	public List<PersonasVO> getPersonas();

	public void savePersonas(PersonasVO miPersona);

	public PersonasVO getPersona(Integer documento);

	public void deletePersona(Integer documento);

}
