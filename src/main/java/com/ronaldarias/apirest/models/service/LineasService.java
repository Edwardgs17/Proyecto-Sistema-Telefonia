package com.ronaldarias.apirest.models.service;

import java.util.List;

import com.ronaldarias.apirest.models.entity.LineasVO;

public interface LineasService {

	public List<LineasVO> getLineas();

	public void guardarLineas(LineasVO miLinea);

	public LineasVO getLineas(Integer numeroLinea);

	public void eliminarLinea(Integer numeroLinea);
}

