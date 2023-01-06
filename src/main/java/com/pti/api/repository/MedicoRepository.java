package com.pti.api.repository;

import com.pti.api.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface MedicoRepository extends JpaRepository <Medico, Long> {

}
