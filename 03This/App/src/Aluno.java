public class Aluno {
    private int id;
    private String nome;
    
    public Aluno(int cId, String cNome) {
        id = cId;
        nome = cNome;
    }

    public void msg() {
        System.out.println(this.id);
        System.out.println(this.nome);
    }   
}