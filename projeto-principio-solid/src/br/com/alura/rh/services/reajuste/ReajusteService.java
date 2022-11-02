package br.com.alura.rh.services.reajuste;

import br.com.alura.rh.models.Funcionario;
import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal valorAumento) {
        BigDecimal salarioAtual = funcionario.getDadosPessoais().getSalario();
        this.validacoes.forEach(validacao -> validacao.validar(funcionario, valorAumento));
        BigDecimal salarioReajustado = salarioAtual.add(valorAumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
