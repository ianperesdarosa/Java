public abstract class Padrao {
    //Obrigatório
    protected abstract void taxaEmprestimo(double valor);
    
    //Opcional
    protected void calculoPoupanca(double valor, double taxa) {
        System.out.println("Ganhos obtidos pela poupança: R$" + (valor * taxa));
    }

}
