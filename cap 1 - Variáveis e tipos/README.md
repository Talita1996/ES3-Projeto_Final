Como já é de conhecimento de todos os desenvolvedores de software, para começar a aprender 
uma nova linguagem de programação, já tendo o conhecimento de alguma outra, basta aprendermos 
como funciona sua sintaxe. visto que a parte lógica o individuo já tem uma boa bagagem de outras
linguagens aprendidas. Dessa forma, nesse treinamento, iremos abordar os principais aspectos do 
Python.

<h1>Variáveis</h1>
As variáveis são simplesmente nomes dados aos espaços de memória para algum dado qualquer. Ou seja, são básicamente um rótulo para simplificar a identificação de um espaço reservado na memória. Com isso a pessoa que está desenvolvendo o software consegue referenciar esse espaço simplesmente digitando esse rótulo que foi definido por ele.

## Criando uma variável:

-Vamos levar em conta que você queira reservar um espaço de memória, e que o rótulo que você quer dar é "testeVar".

```python
>>> testeVar
NameError: name 'testeVar' is not defined
```
Como podemos ver, recebemos uma mensagem de erro descrevendo que testeVar não foi definida. Isso porque, apenas digitamos o nome da variável sem antes fazermos acriação dela em sí.
Para fazer a criação de uma variável em Python devemos seguir um "modelo":

```
Nome da variável = Expressão
```
Obs:
- "Nome da variável, você vai substituir por o rótulo que você deseja
- "=" significa a operração de atribuição, igualmente como outras linguagens de programação
- "Expressão", seria a expressão que você deseja atribuir a aquele espaço na memória. Em python para fazer a criação de uma variável esse campo é necessário

Portanto, pegando esse modelo e usando o nome para variável "testeVar" podemos implementar a criação:

```python
>>> testeVar = 3
```
**CRIAÇÃO FEITA COM SUCESSO!**

Podemos testar se realmente esse valor "3" foi guardado na nossa variável:

```python
>>> testeVar
3
```

Podemos também alterar o valor que está contido na nossa variável "testeVar";

```python
>>> testeVar = testeVar *2
>>> testeVar
6
```

<h2>Tipos</h2>
Em python não declaramos explicitamente com palavras reservadas o tipo da variável como é visto em outras linguagens de programação (int nomeDaVariavel). Aqui o tipo de dado é definido pelo dado informado por vocêno momento da criação da variável ou dinâmicamente a variável pode mudar de tipo dependendo de alguma operação matemática, vamos ver alguns exemplos:

- Variável criada contendo um valor inteiro
```python
>>> x = 5
>>> x
5
>>>type(x)
<type 'int'>
```
    **Podemos ver então que a variável realmente foi criada como tipo inteira**

- Variável criada contendo um valor real
```python
>>> y = 5.5
>>> y
5.5
>>>type(y)
<type 'float'>
```

- Variável criada contendo uma sequência de caracteres
```python
>>> nome = "thalisson"
>>> nome
'thalisson'
>>>type(nome)
<type 'str'>
```
- Variável criada contendo um valor booleano
```python
>>> luz_acesa = True
>>> luz_acesa
True
>>>type(luz_acesa)
<type 'bool'>
```
**É importante destacar que quando você for definir o tipo de uma variável como booleana, o campo de expressão sempre deve ser informado com o primeiro caractere maíusculo, ou seja true e false não irão ser reconhecidos, para ser reconhecido deve ser digitado True ou False**

- Variável criada contendo um valor complexo
```python
>>> numero = 2 + 3j
>>> numero
(2 + 3j)
>>>type(numero)
<type 'complex'>
```

## Como foi dito o tipo de dado pode ser mudado dinamicamente:
```python
>>> numero = 2
>>>type(numero)
<type 'int'>
>>> numero = numero + 3.5
>>> type(numero)
<type 'float'>
```
<h1>Funções de entrada e saída de texto</h1>
Essas funções de entrada e saída de texto, não ´e um conceito nada novo, é visto em outras linguaguens de programação. porém aqui com uma sintaxe diferente.

<h2>Função input()</h2>
Função para inserção de dados pelo usuário no qual ele deverá digitar e apertar ENTER para sinalizar que terminou e quer enviar o dado. É importante salientar que a partir dessa função input todo o dado fornecido pelo usuário vai ser tratado como string (cadeia de caracteres).

- Exemplo de como utilizar o input():
```python
nome = input("digite seu nome:")
```

```python
numero = input("digite um numero qualquer:")
```

<h2>Função print()</h2>
Já a função print() é utilizada para saída de dados, por exemplo mostrar alguma mensagem qualquer na tela ou o valor de uma variável.

- Exemplo de como utilizar o print():
```python
nome = input("digite seu nome:")
print(nome)
```
>Thalisson<br>

```python
numero = input("digite um numero qualquer:")
printf(numero)
```
>5<br>

**Existe tambem outra forma de formatar sua saída de dados que é bastante utilizada:**
```python
numero = input("digite um numero qualquer:")
printf("O numero informado foi {}" .format(numero))
```
>O numero informado foi 5<br>

<h1>Operadores</h1>

Para tornar mais interessante e conseguirmos resolver problemas mais complexos, vamos agora os operadores, temos: operadores aritméticos, de comparação, lógicos, de atribuição e outros como o de verificar o tipo dado, que utilizamos nos exemplos anteriores.

- Operadores aritmeticos (+, -, *, /, %, **, +=, -=, *=, /=, %=, **=):

```python
>>> numero1 = 2
>>> numero2 = 1
>>> s = numero1 + numero2
>>> s
3

>>> n = 3
>>> print (n ** 2)
9
```

## EXERCÍCIO:
    1. Como acabamos de ver operadores aritmeticos podemos fazer um simples exercício, proponho que você tente somar dois numeros, cada um dos dois sendo fornecido pelo usuário. Depois da soma, mostre seu resultado na tela do usuário.
    
##### **Pode ser que seu resultado dê algo estranho. porém, não fique desestimulado o próximo tópico (Conversão entre tipos) pode te ajudar.**

- Operadores de Comparação (>, <, ==, >=, <=, <>, !=, is, in):

```python
>>> a = 1
>>> b = 2
>>> a == b
False
>>> print a > b
False

>>> a = [1, 2, 3]
>>> b = a
>>> a is b
True
>>> 1 in a
True
```
**O operador "is" está compara se as variáveis estão se referindo ao mesmo espaço de memória**
**O operador "in" testa se a variável ou valor a sua esquerda está contido na variável a sua direita**

- Operadores Lógicos (and, or, not):

```python
>>> nome = "leonardo"
>>> idade = 22
>>> nome == "leonardo" and idade < 23
True
```
- Operadores de Atribuição (=):

```python
>>> nome = 1
```

<h1>Conversão entre tipos</h1>
Como já foi visto, o Python define o tipo das variáveis pelos valores informados pelo criador da variável e por meio de operações matemáticas.Ou seja, se eu somar dois inteiros, a variável que guarda o resultado é do tipo inteiro, se eu somo um inteiro com um float, o resultado vai ser do tipo float. Até ai tudo bem, porém. vamos ver um exemplo interessante da operação de divisão.

```python
>>> r = 20/5.5
>>> r
3.6363636363636362

>>> type(r)
<type 'float'>
```

```python
>>> r = 20/4.0
>>> r
2.0

>>> type(r)
<type 'float'>
```

Esse segundo exemplo está correto "2.0" é um número real, porém vamos imaginar se eu quisesse que ele truncasse esse valor e o representasse como um inteiro. Não teriamos prejuízo nenhum matematicamente. E existe sim uma possibilidade de fazermos esse "concerto" usando funções que temos disponíveis no python que são nomeadad exatamente com o nome do tipo de variável que você deseja.

- Vamos ver um exemplo, com "concertando" o caso anterior
  
```python
>>> r = int(20/4.0)
>>> r
2

>>> type(r)
<type 'int'>
```
## ESSE ARTIFÍCIO É ESSENCIAL NO EXERCÍCIO PROPOSTO NO TÓPICO ANTERIOR DE "OPERADORES"

<h1>Continue estudando no próximo capítulo</h1>

[Capítulo 2 - Estruturas de Dados](https://github.com/Talita1996/ES3-Projeto_Final/tree/master/cap%202%20-%20Estruturas%20de%20dados)








