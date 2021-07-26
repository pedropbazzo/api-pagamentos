package com.servico.pagamento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servico.pagamento.entidade.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

	// metodos adicionais
}
