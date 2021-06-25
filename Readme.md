# Usando Memoização

Este repositorio possui uma simples implementação da memoização em Java. 

## Função

Para realizar a comparação entre o tempo de execução entre um programa que utiliza a memoização e outro que não foi usado a função:

```
x -> y % x == 0 
```
sendo `y` um número qualquer pedido ao inicio da execução do programa, ambos os programas deve realizar a busca dos divisores deste número `y` e depois somá-los e assim apresentar o resultado.

## Resultados
Nos testes realizados com `y = 20`, obtive os resultados: 

* No programa com memoização, obtive como resposta: 
```
Sum result = 42 
~ runtime: 11 ms
```
* No programa sem memoização: 
```
Sum result = 42
~ runtime: 15 ms
```
