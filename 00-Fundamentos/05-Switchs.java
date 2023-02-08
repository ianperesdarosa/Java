class Playground {
    public static void main(String[ ] args) {

        switch(10) {
            case 10:
                    System.out.println("Mvp!");
                break;
            case 9:
            case 8:
            case 7:
                    System.out.println("Aprovado!");
                break;  
            case 6:
            case 5:
                    System.out.println("Recuperacao!");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                    System.out.println("Reprovado!");
                break;

            default:
                    System.out.println("Aluno não cadastrado!");
                    
        }
    }    
}