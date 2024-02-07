public class Sistema implements TaxaFiis, TaxaCripto {
  
    public void getTaxaFiis(double valor) {
      System.out.println("Taxa Fiis: R$" + (valor * 0.3));
    }

    public void getTaxaFiisGlobal(double valor) {
        System.out.println("Taxa Fiis Global: R$" + (valor * 0.28));
    }

    public void getTaxaCripto(double valor) {
      System.out.println("Taxa Cripto: R$" + (valor * 0.8));
    }

    public void getTaxaCriptoGlobal(double valor) {
        System.out.println("Taxa Cripto Global: R$" + (valor * 0.25));
    }
    
  }