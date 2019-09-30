package com.ronaldarias.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ronaldarias.apirest.models.dao.FacturaDAO;
import com.ronaldarias.apirest.models.entity.FacturaVO;

@Service
public class FacturaServicioImp implements FacturaServicio{

	@Autowired 
	private FacturaDAO miFacturaDAO;
	
	@Override
	@Transactional(readOnly=true)
	public List<FacturaVO> getFactura() {
		
		return (List<FacturaVO>) miFacturaDAO.findAll();
	}

	@Override
	@Transactional
	public void registrarFactura(FacturaVO miFactura) {
		
		miFacturaDAO.save(miFactura);
		
	}

	@Override
	@Transactional(readOnly=true)
	public FacturaVO getFactura(Integer idFactura) {
		
		return miFacturaDAO.findById(idFactura).get();
	}

	@Override
	@Transactional
	public void eliminarFactura(Integer idFactura) {
		
		miFacturaDAO.deleteById(idFactura);
		
	}


}
