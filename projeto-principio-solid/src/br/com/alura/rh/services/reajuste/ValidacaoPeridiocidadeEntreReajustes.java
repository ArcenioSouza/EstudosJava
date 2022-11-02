package br.com.alura.rh.services.reajuste;

import br.com.alura.rh.exceptions.ValidacaoException;
import br.com.alura.rh.models.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeridiocidadeEntreReajustes implements ValidacaoReajuste {
    public void validar(Funcionario funcionario, BigDecimal valorAumento){
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();

        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDesdeUltimoReajuste > 6){
            throw new ValidacaoException("Intervalo entre reajustes deve ter no mínimo 6 meses");
        }
    }
}
