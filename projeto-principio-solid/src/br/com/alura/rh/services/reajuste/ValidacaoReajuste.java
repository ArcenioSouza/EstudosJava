package br.com.alura.rh.services.reajuste;

import br.com.alura.rh.models.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal valorAumento);
}
