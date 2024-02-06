public class Colaborador extends Pessoa{
    private int saldo;
    private String cargo;

    public Colaborador(String nome, int idade, int saldo, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
        this.cargo = cargo;

        msg();
    }

    protected void msg() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.saldo);
        System.out.println(this.cargo);
    }
}
