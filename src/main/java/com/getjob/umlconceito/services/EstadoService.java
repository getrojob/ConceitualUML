package com.getjob.umlconceito.services;

import com.getjob.umlconceito.domain.Estado;
import com.getjob.umlconceito.repositories.EstadoRepository;
import com.getjob.umlconceito.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository repo;

    public Estado find(Integer id) {
        Optional<Estado> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName()));
    }
}
