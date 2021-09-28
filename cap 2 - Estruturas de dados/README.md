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

```python
>>> print(nomes[3])
Maria
```

## Declaração e alteração
Abaixo é exemplificada a declaração de uma lista com itens e de uma lista vazia:

```python
>>> animais = [ 'gato', 'cachorro', 'peixe' ]
>>> carros = []
```

Uma das características de uma lista em Python é que elas são mutáveis, podendo ser alteradas depois de terem sido criadas. Em outras palavras, podemos adicionar, remover e até mesmo alterar os itens de uma lista.

No código a seguir temos um exemplo de como alterar uma lista:

```python
>>> nomes = [ 'Rafael', 'Joana', 'Ana', 'Maria', 'José' ]
>>> nomes[1] = [ 'Carol' ]
>>> print(nomes)
[ 'Rafael', 'Carol', 'Ana', 'Maria', 'José' ]
```

## Adição de elementos
[//]: <> ( Métodos append e insert )
Além de alterar elementos em listas, também é possível adicionar itens nelas, pois já vêm com uma coleção de métodos predefinidos que podem ser usados para manipular os objetos que ela contém.

Trazendo o conceito de pilhas, a função `push()` era utilizada para adicionar um elemento sempre no topo. É exatamente assim que a função `append()` funciona em Python:

```python
>>> nomes.append('Marília')
>>> print(nomes)
[ 'Rafael', 'Carol', 'Ana', 'Maria', 'José', 'Marília' ]
```

Mas nem sempre queremos simplesmente concatenar valores ao fim da lista. Para lidar com isso, temos também o método `insert()` que recebe dois parâmetros: o índice onde o elemento deve ser adicionado e o valor do elemento.

```python
>>> nomes.insert(1, 'Marília')
>>> print(nomes)
[ 'Rafael', 'Marília', 'Carol', 'Ana', 'Maria', 'José' ]
```

Observe que o `insert()` "empurra" todos os elementos para uma posição à frente. Dessa forma, "Carol" que possuía indíce 1, passa a ocupar o índice 2, e assim por diante.

## Remoção de elementos
[//]: <> ( Métodos remove e pop )
Assim como podemos adicionar itens em nossa lista, também podemos retirá-los. Existem duas maneiras básicas de se remover elementos em uma lista: através do valor ou através do índice.

A função `remove()` tem como parâmetro o valor do elemento que deve ser removido. Vejamos como retirar "Maria" da nossa lista de nomes:

```python
>>> nomes.remove('Maria')
>>> print(nomes)
[ 'Rafael', 'Marília', 'Carol', 'Ana', 'José' ]
```

Por outro lado, para remover através do índice podemos utilizar a função `pop()` que recebe como parâmetro a posição do item na lista. Abaixo iremos remover o elemento que está na posição 2:

```python
>>> nomes.pop(2)
>>> print(nomes)
[ 'Rafael', 'Marília', 'Ana', 'José' ]
```

# Tuplas
[//]: <> ( Coleção de valores indexados e imutáveis )
[//]: <> ( A declaração de uma tupla é igual a de uma Lista, com a diferença apenas que devem ser usados parênteses ao invés de colchetes )
[//]: <> ( Na declaração de uma tupla com apenas 1 item, deve ser colocado uma vírgula após o item senão será interpretado como string )

Tupla é uma estrutura de dados semelhante a lista. Porém, ela tem a característica de ser imutável, ou seja, após uma tupla ser criada, ela não pode ser alterada. Vejamos o uso desse objeto em código:

```python
>>> transportes = ('carro', 'moto', 'bicicleta', 'ônibus', 'avião')
>>> print(transportes)
( 'carro', 'moto', 'bicicleta', 'ônibus', 'avião' )
```

As tuplas devem ser usadas em situações em que não haverá necessidade de adicionar, remover ou alterar elementos de um grupo de itens. Exemplos bons seriam os meses do ano, os dias da semana, as estações do ano etc. Entretanto, ainda é possível acessar elementos através do índice. Vejamos:

```python
>>> transportes[2]
bicicleta
```

Uma observação a ser feita no uso de uma tupla é que se ela tiver um único item, é necessário colocar uma vírgula depois dele, pois caso contrário, o objeto que vamos obter é uma string, porque o valor do item é do tipo string. 

```python
>>> objeto_string = ('tesoura')
>>> objeto_tupla = ('tesoura',)

>>> print(type(objeto_string)) 
class 'str'
>>> print(type(objeto_tupla)) 
class 'tuple'
```

# Dicionários
## Declaração e alteração

## Adição de elementos

## Remoção de elementos
[//]: <> ( del remove o item em um índice específico e pop remove o item em um índice específico e o retorna )