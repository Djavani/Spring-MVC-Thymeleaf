package com.djavani.curso.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.djavani.curso.boot.domain.Cargo;
import com.djavani.curso.boot.service.CargoService;

@Component
public class StringToCargoConversor implements Converter<String, Cargo>{

	@Autowired
	private CargoService cargoService;
			
	@Override
	public Cargo convert(String text) {
		if(text.isEmpty()) {
			return null;			
		}
		Long id = Long.valueOf(text);
		return cargoService.buscaPorId(id);
	}

}
