package com.getjob.umlconceito.services;

import com.getjob.umlconceito.domain.Cidade;
import com.getjob.umlconceito.repositories.CidadeRepository;
import com.getjob.umlconceito.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository repo;

    public Cidade find(Integer id) {
        Optional<Cidade> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cidade.class.getName()));
    }
}
