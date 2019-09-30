package com.ronaldarias.apirest.models.service;

import java.util.List;

import com.ronaldarias.apirest.models.entity.FacturaVO;

public interface FacturaServicio {

	public List<FacturaVO> getFactura();

	public void registrarFactura(FacturaVO miFactura);

	public FacturaVO getFactura(Integer idFactura);

	public void eliminarFactura(Integer idFactura);
}
