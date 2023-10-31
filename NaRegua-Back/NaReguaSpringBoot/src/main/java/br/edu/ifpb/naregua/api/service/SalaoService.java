package br.edu.ifpb.naregua.api.service;

import br.edu.ifpb.naregua.api.model.Salao;
import br.edu.ifpb.naregua.api.repositories.SalaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaoService {

    @Autowired
    private SalaoRepository salaoRepository;


    public List<Salao> getSaloes(){
        List<Salao> saloes = this.getSaloesBynFuncionarios();
        saloes.forEach(u -> System.out.println("filtro: " + u.getNome()));
        return salaoRepository.findAll();
    }

    public Salao getSalaoPorId(Long idSalao){
        return this.salaoRepository.findById(idSalao).orElse(null);
    }

    @Transactional
    public Salao inserirouAtualizar(Salao salao){
        Salao salaoInserido = this.salaoRepository.save(salao);
        return salaoInserido;
    }

    public void apagar(Long id){
        this.salaoRepository.deleteById(id);
    }

    public List<Salao> getSaloesBynFuncionarios(){
        return this.salaoRepository.getSaloesByndeFuncionarios();
    }

}
