public class Desafio5Alura_Converter {
    static void main() {
        /* Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
         Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em
         dólares para reais e imprima o resultado formatado.
    */

        double valorEmDolares = 20;
        double valorEmReais = 4.94;
        double conversao = valorEmDolares * valorEmReais;

        System.out.println(String.format("O valor total convertido ficou em : %.2f reais", conversao));






    }
}
