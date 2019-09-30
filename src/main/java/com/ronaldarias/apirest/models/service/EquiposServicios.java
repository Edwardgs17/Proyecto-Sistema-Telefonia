package com.ronaldarias.apirest.models.service;

import java.util.List;

import com.ronaldarias.apirest.models.entity.EquiposVO;

public interface EquiposServicios {

	public List<EquiposVO> getEquipos();

	public void guardarEquipos(EquiposVO miEquipo);

	public EquiposVO getEquipos(Integer Imei);

	public void eliminarEquipos(Integer Imei);
}
