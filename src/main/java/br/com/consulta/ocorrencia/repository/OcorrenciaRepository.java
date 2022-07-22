package br.com.consulta.ocorrencia.repository;

import br.com.consulta.ocorrencia.domain.Cliente;
import br.com.consulta.ocorrencia.domain.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Integer>{

    List<Ocorrencia> findAll();
    Ocorrencia findBycodOcorrencia(int codOcorrencia);
    List<Ocorrencia> findByCliente(Cliente cliente);
    List<Ocorrencia> findBysituacao(int situacao);
    List<Ocorrencia> findBytipoOcorrencia(int tipoOcorrencia);
    List<Ocorrencia> findBySituacaoAndCliente(int situacao, Cliente cliente);


}