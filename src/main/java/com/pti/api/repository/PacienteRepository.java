package com.pti.api.repository;

import com.pti.api.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Medico, Long> {
}