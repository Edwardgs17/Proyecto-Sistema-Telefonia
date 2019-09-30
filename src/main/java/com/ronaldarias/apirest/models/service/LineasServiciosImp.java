package com.ronaldarias.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ronaldarias.apirest.models.dao.LineaDAO;
import com.ronaldarias.apirest.models.entity.LineasVO;

@Service
public class LineasServiciosImp implements LineasService {

	@Autowired 
	private LineaDAO lineaDAO;
	
	@Override
	@Transactional(readOnly=true)
	public List<LineasVO> getLineas() {
		
		return (List<LineasVO>) lineaDAO.findAll();
	}

	@Override
	@Transactional
	public void guardarLineas(LineasVO numeroLinea) {
		
		lineaDAO.save(numeroLinea);
		
	}

	@Override
	@Transactional(readOnly=true)
	public LineasVO getLineas(Integer numeroLinea) {
		
		return lineaDAO.findById(numeroLinea).get();
	}

	@Override
	@Transactional
	public void eliminarLinea(Integer numeroLinea) {
		
		lineaDAO.deleteById(numeroLinea);
		
	}

}
