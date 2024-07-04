<h1> ExemploWhile </h1>
Este projeto Java demonstra um exemplo de uso da estrutura de repetição while , onde um valor de mesada é utilizado para comprar doces até que o valor da mesada se esgote.

## Descrição

O programa simula a compra de doces com uma mesada inicial de 50.0. Em cada iteração do loop _`while`_, um valor aleatório entre 2 e 8 é gerado para representar o custo de um doce. Se o custo do doce for maior do que o valor restante da mesada, o valor do doce é ajustado para ser igual ao valor restante da mesada. O valor do doce é então subtraído da mesada e uma mensagem é exibida indicando o valor do doce adicionado ao carrinho. O loop continua até que a mesada seja completamente gasta. Finalmente, o programa imprime uma mensagem indicando que todo o dinheiro foi gasto em doces.

## Estrutura do Código

`public class ExemploWhile :` A classe principal do programa.

`public static void main(String[] args) :` O método principal onde a lógica do programa é executada.

`private static double valorAletorio() :` Um método auxiliar que gera um valor aleatório entre 2 e 8.

## Funcionamento

1. Inicialização da Mesada:

    - A variável `mesada` é inicializada com o valor 50.0.

2. Loop While:

    - O loop `while` continua a executar enquanto `mesada` for maior que 0.
    - Dentro do loop, `valorDoce` recebe um valor aleatório gerado pelo método `valorAletorio()`.
    - Se `valorDoce` for maior que `mesada`, `valorDoce` é ajustado para ser igual a `mesada`.
    - O valor do doce é subtraído da mesada.
    - Uma mensagem é impressa indicando o valor do doce adicionado ao carrinho.
## *Conclusão:*

    Quando a mesada se esgota, uma mensagem final é impressa indicando que todo o dinheiro foi gasto em doces.