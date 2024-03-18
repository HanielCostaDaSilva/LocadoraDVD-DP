## Tarefa 1: 
De acordo com o programa apresentado, quais as fragilidades que podem ser
encontradas com relação a más práticas de programação ou princípios de design OO que
não estão sendo contemplados? O sistema está pronto quando uma nova classificação de
filme for adicionada? E quando houver reajuste de preço? O código está pronto para
executar facilmente um novo esquema de pontos de alugador frequente? 

## Resposta

### DVD

```
public static final int NORMAL = 0;
public static final int LANÇAMENTO = 1;
public static final int INFANTIL = 2;
```

#### príncipio O - esta parte do código poderia estar em um classe a parte, a fim de reuso.
#### Solução: criação de uma classe enum chamada `Tipo`

### Aluguel
```
public class Aluguel {
    private DVD dvd;
```
#### príncipio L - a classe Aluguel está atuando diretamente com a classe DVD, o que não é uma boa prática. 
#### Solução: criação de uma classe genérica para DVD e a fins, como `Produto`


### CLiente
