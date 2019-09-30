package com.ronaldarias.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ronaldarias.apirest.models.dao.EquiposDAO;
import com.ronaldarias.apirest.models.entity.EquiposVO;

@Service
public class EquiposServiciosImp implements EquiposServicios{

	@Autowired
	private EquiposDAO equiposDAO;
	
	@Override
	@Transactional(readOnly=true)
	public List<EquiposVO> getEquipos() {
		return (List<EquiposVO>) equiposDAO.findAll();
	}

	@Override
	@Transactional
	public void guardarEquipos(EquiposVO miEquipo) {
		equiposDAO.save(miEquipo);
		
	}

	@Override
	@Transactional(readOnly=true)
	public EquiposVO getEquipos(Integer Imei) {
		
		return equiposDAO.findById(Imei).get();
	}

	@Override
	@Transactional
	public void eliminarEquipos(Integer Imei) {
	
		equiposDAO.deleteById(Imei);
	}

	
}
