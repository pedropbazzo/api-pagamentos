package com.servico.pagamento.servico;

import java.time.LocalDate;

import com.servico.pagamento.entidade.CartaoCredito;
import com.servico.pagamento.entidade.TipoBandeira;

public interface CartaoServico {

	public boolean validarCartao(CartaoCredito cartaoCredito);

	public boolean validarNumeroCartao(String numCartao);

	public boolean validarCvvCartao(String cvv);

	public boolean validarDataValidade(LocalDate dataValidade);

	public TipoBandeira identificarBandeira(String numCartao);

	public CartaoCredito salvarCartao(CartaoCredito cartaoCredito);
}
