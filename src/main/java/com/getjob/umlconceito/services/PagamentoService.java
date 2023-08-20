package com.getjob.umlconceito.services;

import com.getjob.umlconceito.domain.Pagamento;
import com.getjob.umlconceito.repositories.PagamentoRepository;
import com.getjob.umlconceito.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository repo;

    public Pagamento find(Integer id) {
        Optional<Pagamento> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pagamento.class.getName()));
    }
}
