package com.getjob.umlconceito.services;

import com.getjob.umlconceito.domain.Categoria;
import com.getjob.umlconceito.domain.Pedido;
import com.getjob.umlconceito.repositories.CategoriaRepository;
import com.getjob.umlconceito.repositories.PedidoRepository;
import com.getjob.umlconceito.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
