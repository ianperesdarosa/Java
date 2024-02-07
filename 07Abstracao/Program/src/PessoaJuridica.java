public class PessoaJuridica  extends Padrao{
    @Override
    protected void taxaEmprestimo(double valor) {
        System.out.println("Taxa de empréstimo para pessoa judírica: R$" + (valor * 0.6));
    }
}
