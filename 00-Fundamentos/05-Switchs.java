class Switchs {
    public static void main(String[ ] args) {

        switch (10) {
            case 10 -> System.out.println("Mvp!");
            case 9, 8, 7 -> System.out.println("Aprovado!");
            case 6, 5 -> System.out.println("Recuperação!");
            case 4, 3, 2, 1, 0 -> System.out.println("Reprovado!");
            default -> System.out.println("Aluno não cadastrado!");
        }
    }
}