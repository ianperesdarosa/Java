public class Person {
    public String nome;
    public int idade;

    private String getNome() {
        return this.nome;
    }

    public void setNome(String fNome) {
        this.nome = fNome;
    }

    private int getIdade() {
        return this.idade;
    }

    public void setIdade(int fIdade) {
        this.idade = fIdade;
    }

    public void msg() {
        System.out.println(getNome());
        System.out.println(getIdade());
    }
}
