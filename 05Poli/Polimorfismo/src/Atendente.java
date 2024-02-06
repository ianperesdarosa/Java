public class Atendente  extends Imposto{
    @Override
    public void valeTransporte(int salario) {
        int imposto = salario * 7;

        System.out.println("Desconto padrão do vale transporte: " + imposto);
    }

    @Override
    public void valeAlimentacao(int salario) {
        int imposto = salario * 7;

        System.out.println("Desconto padrão do vale alimentação: " + imposto);
    }
}
