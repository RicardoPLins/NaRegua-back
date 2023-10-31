package br.edu.ifpb.naregua.api.controller;

import br.edu.ifpb.naregua.api.model.Salao;
import br.edu.ifpb.naregua.api.service.SalaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class SalaoController {

    @Autowired
    public SalaoService salaoService;

    @GetMapping("/saloes")
    public List<Salao> getSaloes(){
        return this.salaoService.getSaloes();
    }

    @GetMapping("saloes/{id}")
    public Salao getSalaoPorId(@PathVariable("id") Long idSalao){
        return this.salaoService.getSalaoPorId(idSalao);
    }


    @PostMapping("/saloes")
    public Salao inserirSalao(@RequestBody Salao salao){
        return this.salaoService.inserirouAtualizar(salao);
    }
    @PutMapping("/saloes/{id}")
    public Salao atualizarSalao(@RequestBody Salao salao){
        return this.salaoService.inserirouAtualizar(salao);
    }

    @DeleteMapping("/saloes/{id}")
    public void apagarSalao(@PathVariable("id") Long id){
        this.salaoService.apagar(id);
    }

    @GetMapping("saloes/filtro")
        public List<Salao> getSaloesByndeFuncionarios() {
        return this.salaoService.getSaloesBynFuncionarios();
    }


}
