public class PessoaFisica extends Padrao {

    @Override
    protected void taxaEmprestimo(double valor) {
        System.out.println("Taxa de empréstimo para pessoa física: R$" + (valor * 0.2));
    }

    @Override
    protected void calculoPoupanca(double valor, double taxa) {
        System.out.println("Ganhos obtidos pela poupança: R$" + (valor * taxa));
    }
    
}
