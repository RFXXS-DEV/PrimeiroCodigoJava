public class Desafio6Alura_Desconto {
    static void main() {
        /* Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
        representando o preço original de um produto. Em seguida, declare uma variável do tipo double
        percentualDesconto e atribua um valor percentual de desconto ao produto
        (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original
        e imprima o novo preço com desconto.
    */

        double precoOriginal = 194.90;
        double percentualDesconto = 10;

        double valorDesconto = (percentualDesconto * 0.01) * precoOriginal;

        double precoComDesconto = precoOriginal - valorDesconto;

        System.out.println("O valor antigo era: R$" + precoOriginal);
        System.out.println(String.format("O valor do desconto foi de R$%.2f", valorDesconto));
        System.out.println("O valor com o desconto foi de: R$" + precoComDesconto);










    }
}
