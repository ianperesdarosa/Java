public class Estagiario extends Imposto {
    
    public void valeTransporte(int salario) {
        int imposto  = salario * 1;

        System.out.println("Desconto padrão do vale transporte: " + imposto);
    }

    public void valeAlimentacao(int salario) {
        int imposto  = salario * 1;

        System.out.println("Desconto padrão do vale alimentação: " + imposto);
    }
}   
