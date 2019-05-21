package com.wendeleyf.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendeleyf.cursomc.domain.Categoria;
import com.wendeleyf.cursomc.domain.Cliente;
import com.wendeleyf.cursomc.repositories.ClienteRepository;
import com.wendeleyf.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+ id + ", Tipo: " + Categoria.class.getName()));
	}
}
