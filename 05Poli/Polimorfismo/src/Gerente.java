public class Gerente  extends Imposto{
    
    @Override
    public void valeTransporte(int salario) {
        int imposto = salario * 12;

        System.out.println("Desconto padrão do vale transporte: " + imposto);
    }

    @Override
    public void valeAlimentacao(int salario) {
        int imposto = salario * 12;

        System.out.println("Desconto padrão do vale alimentação: " + imposto);
    }
}
