package ProjetoBanco;

import java.util.Scanner;

public class ExercícioBanco {
    static void main() {
        Scanner input = new Scanner(System.in);

        String conta = "Corrente";
        double saldo = 2000;
        int escolha = 0;

        String menu = """
                **************************
                *--------- Menu ---------*
                **************************
                ***  Digite uma opção  ***
                *                        *
                *   1 - Consultar Saldo  *
                *   2 - Transferir Valor *
                *   3 - Receber Valor    *
                *   4 - Sair             *
                *                        *
                **************************
                """;

        System.out.println("**************************");
        System.out.println("* Conta: " + conta);
        System.out.println("* Saldo: " + saldo);


        while (escolha != 4) {
            System.out.println(menu);
            escolha = input.nextInt();

            if (escolha == 1){

                System.out.println("Seu saldo é: R$" + saldo);

            }else if (escolha == 2){

                System.out.println("Seu saldo atual é: R$" + saldo);
                System.out.println("\nInsira o Valor que deseja transferir: ");
                double valorTransferir = input.nextDouble();

                if (valorTransferir > 0 && valorTransferir <= saldo){

                    saldo -= valorTransferir;
                    System.out.println("Transferência realizada com sucesso!");

                }else if (valorTransferir > saldo) {

                    System.out.println("\nSaldo insuficiente");

                }else {

                    System.out.println("\nSelecione um valor válido");

                }

            }else if(escolha == 3){
                System.out.println("Seu saldo atual é: R$" + saldo);
                System.out.println("\nInsira o Valor que deseja Receber: ");
                double valorReceber = input.nextDouble();

                if (valorReceber > 0){

                    saldo += valorReceber;
                    System.out.println("\nSaldo atualizado com sucesso!");

                }else {

                    System.out.println("\nSelecione um valor válido");

                }
            }
        }

    }


}
