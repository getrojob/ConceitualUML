package com.getjob.umlconceito.repositories;

import com.getjob.umlconceito.domain.Categoria;
import com.getjob.umlconceito.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
