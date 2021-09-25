A linguagem Python oferece por padrão algumas estruturas de dados que nos permitem armazenar conjuntos de dados dentro de uma única variável. O objetivo desse capítulo consiste em apresentar três estruturas e suas principais funções:
- Listas
- Tuplas
- Dicionários

# Listas
[//]: <> ( Explicação sobre a estrutura da lista, mostrando os valores e os índices. )
[//]: <> ( Adicionar imagem explicativa.)
[//]: <> ( Lembrar que o índice começa em 0.) 
[//]: <> ( Os elementos da lista não precisam ter o mesmo tipo)

Uma lista consiste em um conjunto de dados indexados de modo que o valor utilizado para o índice corresponde à posição do item. Convém citar que em Pyhon a primeira posição é sempre zero, de modo que o índice do último elemento de uma lista que possui 15 itens é 14.

![Lista](/assets/lista.png)

Acima temos uma representação ilustrada de uma lista chamada "nomes" que contém simplesmente os nomes de algumas pessoas. Cada índice (em vermelho) possui como valor (em verde) o nome de alguém. Com esssas informações podemos, por exemplo, imprimir na tela o valor contido na posição 3:

```sh
>>> print(nomes[3])
Maria
```

## Declaração e alteração
Abaixo é exemplificada a declaração de uma lista com itens e de uma lista vazia:

```sh
>>> animais = [ 'gato', 'cachorro', 'peixe' ]
>>> carros = []
```

Uma das características de uma lista em Python é que elas são mutáveis, podendo ser alteradas depois de terem sido criadas. Em outras palavras, podemos adicionar, remover e até mesmo alterar os itens de uma lista.

No código a seguir temos um exemplo de como alterar uma lista:
```sh
>>> nomes = [ 'Rafael', 'Joana', 'Ana', 'Maria', 'José' ]
>>> nomes[1] = [ 'Carol' ]
>>> print(nomes)
[ 'Rafael', 'Carol', 'Ana', 'Maria', 'José' ]
```

## Adição de elementos
[//]: <> ( Métodos append e insert )

## Remoção de elementos
[//]: <> ( Métodos remove e pop )

# Tuplas
[//]: <> ( Coleção de valores indexados e imutáveis )
[//]: <> ( A declaração de uma tupla é igual a de uma Lista, com a diferença apenas que devem ser usados parênteses ao invés de colchetes )
[//]: <> ( Na declaração de uma tupla com apenas 1 item, deve ser colocado uma vírgula após o item senão será interpretado como string )

# Dicionários
## Declaração e alteração

## Adição de elementos

## Remoção de elementos
[//]: <> ( del remove o item em um índice específico e pop remove o item em um índice específico e o retorna )