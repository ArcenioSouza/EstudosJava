package br.com.alura.rh.services.reajuste;

import br.com.alura.rh.exceptions.ValidacaoException;
import br.com.alura.rh.models.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {
    public void validar(Funcionario funcionario, BigDecimal valorAumento){
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = valorAumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
