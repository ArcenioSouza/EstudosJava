package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal valorAumento){
        BigDecimal salarioAtual = funcionario.getSalario();
        this.validacoes.forEach(validacao -> validacao.validar(funcionario, valorAumento));
        BigDecimal salarioReajustado = salarioAtual.add(valorAumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
