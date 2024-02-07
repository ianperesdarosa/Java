public class App {
    public static void main(String[] args) {
        PessoaJuridica pj = new PessoaJuridica();
        pj.taxaEmprestimo(20.000);

        PessoaFisica pf = new PessoaFisica();
        pf.taxaEmprestimo(8.000);
        pf.calculoPoupanca(12.000, 0.3);
    }
}
