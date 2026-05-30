package Conteúdos_e_Exercícios;

public class Planos_e_Filmes {
    static void main() {


        int ano = 2026;

        boolean disponivelNopPlano = true;

        double notaDoFilme = 9.1;

        String nivelPlano = "plus";

        if (ano >= 2025){

            System.out.println("Este filme moderno");


        } else {
            System.out.println("Este filme antigo");
        }

        if (disponivelNopPlano == true && nivelPlano.equals("plus")){
            System.out.println("Filme Liberado");

        } else{
            System.out.println("Filme Bloqueado, Alugue o Filme");
        }



    }
}
