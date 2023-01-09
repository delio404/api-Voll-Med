package com.pti.api.controller;

import com.pti.api.medico.DadosCadastroMedico;
import com.pti.api.medico.DadosListagemMedico;
import com.pti.api.medico.Medico;
import com.pti.api.repository.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
       repository.save(new Medico(dados));

    }
    @GetMapping
    public List<DadosListagemMedico> listar(){
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}
