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

#### príncipio OL - esta parte do código poderia estar em uma classe a parte, a fim de reuso.
#### Solução: Transformar `DVD` em uma classe abstrata e para cada Atributo de enumeração a criação de uma classe específica: `DVDNormal`, `DVDLancamento`,`DVDINFantil`


### CLiente

```
    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");

        double valorTotal = 0.0;

        int pontosDeAlugadorFrequente = 0;

        Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + getNome() +
                fimDeLinha);

        while (alugueis.hasNext()) {
            double valorCorrente = 0.0;
            Aluguel cada = alugueis.next();

            // determina valores para cada linha
            int tipoDVD = cada.getProduto().getCodigoDePreco();

            switch (tipoDVD) {

                case 1: // R$ 2.00 por 2 dias. O dia adicional acrescenta R$ 1.50
                    valorCorrente += 2.0;
                    if (cada.getDiasAlugado() > 2) {
                        valorCorrente += (cada. getDiasAlugado() - 2) *
                                1.5;
                    }
                    break;
                case 2: // R$ 3.00 por dia
                    valorCorrente += cada.getDiasAlugado() * 3.00;
                    break;
                case 3: // R$ 1.50 por 3 dias. O dia adicional acrescenta R$ 1.50
                    valorCorrente += 1.5;
                    if (cada.getDiasAlugado() > 3) {
                        valorCorrente += (cada.getDiasAlugado() - 3) *
                                1.5;
                    }
                    break;
            } //switch
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;

            // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
            if (cada.getProduto().getCodigoDePreco() == 3 &&
                    cada.getDiasAlugado() > 1) {
                pontosDeAlugadorFrequente++;
            }
            // mostra valores para este aluguel

            resultado.append("\t").append(cada.getProduto().getTitulo()).append("\t").append(valorCorrente).append(fimDeLinha);
            valorTotal += valorCorrente;
        }
```

#### só a existência deste método é um grande problema {não sei como alguém conseguiu estruturar algo assim}.

#### príncipio S - A classe Cliente não deve ser a responsável por calcular o preço da diária cada DVD.
#### Solução: Ao realizar a divisão dos tipos de `DVD`, criar um método abstrato chamado: `calcularDiaria()`, que calculará o preço de uma com o DVD pedido. Cada tipo de DVD irá implementar este método.

#### príncipio S - A classe Cliente não deve ser a responsável por verificar o tipo do DVD na hora de checar se deve dá um bônus.
#### Solução: Ao realizar a divisão dos tipos de `DVD`, criar o atributo protegido: `ehBonus`, que ficará responsável por dizer se o DVD deverá dar um bônus ao cliente.


#### príncipio D - A classe Cliente não precisa saber da existência da Classe DVD, ao calcular o preço ou dá um bônus;
#### Solução: O `Aluguel`, que  contém as informações dos `DVD`s, pode realizar a chamada do método `calcularDiaria(int DiasAlugado)` ou `ehDVDBonus()`, assim o Cliente não irá interagir diretamente com o objeto.

