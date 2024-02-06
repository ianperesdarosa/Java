public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.valeAlimentacao(5600);
        gerente.valeTransporte(5600);
        System.out.println("---------");
        Atendente atendente = new Atendente();
        atendente.valeAlimentacao(2500);
        atendente.valeTransporte(2500);
        System.out.println("---------");
        Estagiario estagiario = new Estagiario();
        estagiario.valeAlimentacao(800);
        estagiario.valeTransporte(800);
    }
}
