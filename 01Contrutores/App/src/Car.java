public class Car {
    String pNome;
    int pAno;
    String pModelo;
    
    public Car(String nome, int ano, String modelo){
        pNome = nome;
        pAno = ano;
        pModelo = modelo;
    }

    public void cardInfo() {
        System.out.println(pNome);
        System.out.println(pModelo);
        System.out.println(pAno);
    }
}
