package com.pti.api.repository;

import com.pti.api.medico.Medico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


//@Repository
public interface MedicoRepository extends JpaRepository <Medico, Long> {

    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
