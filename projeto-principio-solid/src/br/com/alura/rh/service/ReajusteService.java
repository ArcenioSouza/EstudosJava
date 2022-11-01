package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class ReajusteService {
    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal valorAumento){
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = valorAumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
        BigDecimal salarioReajustado = salarioAtual.add(valorAumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
