package com.servico.pagamento.converte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.servico.pagamento.dto.ClienteDTO;
import com.servico.pagamento.entidade.Cliente;
import com.servico.pagamento.exception.ClienteNaoEncontradoException;
import com.servico.pagamento.servico.ClienteServico;

@Component
public class DtoToClienteConverte implements Converter<ClienteDTO, Cliente> {

	@Autowired
	private ClienteServico clienteServico;

	@Override
	public Cliente convert(ClienteDTO clienteDTO) {
		Cliente cliente = clienteServico.buscarCliente(clienteDTO);
		if (!ObjectUtils.isEmpty(cliente)) {
			return cliente;
		} else {
			throw new ClienteNaoEncontradoException(clienteDTO.getIdCliente());
		}
	}
}
