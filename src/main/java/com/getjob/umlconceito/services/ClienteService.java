package com.getjob.umlconceito.services;

import com.getjob.umlconceito.domain.Categoria;
import com.getjob.umlconceito.domain.Cliente;
import com.getjob.umlconceito.repositories.ClienteRepository;
import com.getjob.umlconceito.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
