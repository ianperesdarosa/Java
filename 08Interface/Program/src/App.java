public class App {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.getTaxaFiis(100.000);
        System.out.println("_____________");
        sistema.getTaxaFiisGlobal(200.000);
        System.out.println("_____________");
        sistema.getTaxaCripto(100.000);
        System.out.println("_____________");
        sistema.getTaxaCriptoGlobal(500.000);
    }
}
