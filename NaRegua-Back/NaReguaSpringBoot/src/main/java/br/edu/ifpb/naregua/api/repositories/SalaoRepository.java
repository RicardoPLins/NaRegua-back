package br.edu.ifpb.naregua.api.repositories;


import br.edu.ifpb.naregua.api.model.Salao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
//@RequestMapping("/")
public interface SalaoRepository extends JpaRepository<Salao, Long> {


    @Query("SELECT s FROM Salao s WHERE s.funcionarios > 1")
    public List<Salao> getSaloesByndeFuncionarios();
}
