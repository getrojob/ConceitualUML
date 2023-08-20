package com.getjob.umlconceito.repositories;

import com.getjob.umlconceito.domain.Cidade;
import com.getjob.umlconceito.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
