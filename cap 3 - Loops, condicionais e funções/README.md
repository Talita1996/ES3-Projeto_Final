# Capítulo 3


Nesse capítulo você verá:
- Condicionais
    - if
    - else
    - elif
- operadores Lógicos
    - and
    - or
    - not
- Loops
    - Estrutura de Repetição Loop For
    - Loops Aninhados
    - Estrutura de Repetição Loop While
    - Pass, Break e Continue
- Métodos
- Funções
    - Variáveis locais e globais 
    - Funções Buit-in
    - Funções str, int, float
    - Funções usando outras Funções








## Condicionais
O condicional if nos permite dizer ao computador para executar ações com base em um determinado conjunto de resultados. O **if** em inglês significa "Se" em português e o **else** significa senão. Então verbalmente, podemos imaginar que estamos dizendo ao computador:
>Se isso acontecer execute está ação. Senão execute esta outra ação.

### Exemplo simples de if e else em python:

~~~python
    if (expressão 1):
        print("Comando executado caso a expressão 1 seja Verdadeira")
    else:
        print("comando executado caso a expressão 1 seja Falsa")
~~~

Caso tenha várias outras condições é aconselhável utilizar o comando **elif** ao invés de utilizar vários if else aninhado como por exemplo:

~~~python
if (expressão 1):
    print("Comando executado caso a expressão 1 seja Verdadeira")
elif(expressão 2):
    print("comando executado caso a expressão 1 seja Falsa e a expressão 2 seja Verdadeira")
else:
    print("comando executado caso a expressão 1 seja Falsa e a expressão 2 seja Falsa")
~~~

Ao invés de:

~~~python
if (expressão 1):
    print("Comando executado caso a expressão 1 seja Verdadeira")
else:
    if(expressão 2):
        print("comando executado caso a expressão 1 seja Falsa e a expressão 2 seja Verdadeira")
    else:
        print("comando executado caso a expressão 1 seja Falsa e a expressão 2 seja Falsa")
~~~
**Lembre-se de usar a indentação no seu código, porque, caso contrário o interpretador irá retornar um erro de sintaxe!** O comando em python deve estar indentado e não pode estar no mesmo nível da palavra reservada **if**, **else** ou **elif**. 

Alguns exemplos:
~~~python
if 9==9:
    print("Verdadeiro")
~~~
Irá retornar **Verdadeiro**
### No caso do codigo acima temos 3 observações:
#### Observação 1: 
A expressão booleana não precisa necessariamente ficar entre (), basta ficar entre o comando **if**  e os dois pontos **:**
#### Observação 2: 
Não precisa obrigatoriamente ter o **else** depois do **if**, isso porque, caso não tenha o **else** o interpretador python simplesmente irá verificar se a expressão dentro do **if** é verdadeira e se for falsa ele apenas não executará a instrução dentro do **if** e irá executar a próxima instrução.
#### Observação 3:
A condição dentro do **if** deve ser uma expressão booleana, logo para se ter uma condição em que se compara se tal valor é igual a outro valor deve ser usado 2 iguais juntos “==” Chamado de operador de igualdade no Python.  Apenas 1 igual representa uma atribuição.  



### Operadores Lógicos:
Os operadores lógicos **and**, **or** e **not** funcionam normalmente na linguagem python e para utilizá-los basta apenas colocar a expressão lógica entre o comando condicional e os dois pontos **:** Para se obter um código mais limpo é aconselhável colocar a expressão lógica dentro de ()


#### Exemplo simples do operador **and**:
~~~python
x = 9
y = 10
z = 8

if(x>z) and (x<y):
    print("x é maior que z e é menor do que y")

~~~
Nesse caso irá ter como saída a mensagem: **x é maior que z e é menor do que y**.
#### Exemplo simples do operador **or**:
~~~python
temperatura1 = 35
temperatura2 = 28

if(temperatura1 > 30) or (temperatura2 > 30):
    print("liga o Ar-condicionado!")
~~~
Nesse caso qualquer uma das duas condições se passar de 30 irá ligar o ar-condicionado. Logo como a temperatura 1 está maior do que 30 então terá como saída **liga o Ar-condicionado!**


#### Exemplo simples do operador not
~~~python
sensor1 = True

if(not sensor1):
    print("liga a esteira")
else:
    print("Desliga a esteira")
~~~
Nesse caso o resultado na saída será **Desliga a esteira**, porque, o operador lógico **not** irá inverter o valor lógico da variável **sensor1**, como a variável sensor1 está verdadeira então dentro do parâmetro do if por causa do operador not ela irá ser lida como falsa e não irá satisfazer a condição de verdadeiro para executar a primeira instrução.


## Loops
### Estrutura de Repetição Loop For
Assim como nas demais linguagens de programação o **for** apresenta a mesma funcionalidade de executar um comando ou conjunto de comandos em um numero determinado de vezes. Na linguagem python tendo sua sintaxe:

~~~python
for item in série-de-itens :
    Executar comandos

~~~
>O nome da variável usada para o **item** pode ser qualquer uma, menos palavras reservadas do python e é claro que você deve usar o bom senso em escolher um nome que faça sentido. Essa variável poderá ser referenciada dentro do loop **for** se você quiser utilizar o condicional **if** para executar algum tipo de verificação .

>A **série-de-items** é uma coleção de valores que poderá ser qualquer sequência de valores em python que pode ser listas e tuplas por exemplo.

Podemos utilizar o loop for em objetos sequenciais como:
- strings
- listas
- tuplas
- elementos de dicionários
- arquivos 
### Alguns exemplos utilizando **for**:

~~~python
# Criando uma tupla e imprimindo cada um dos valores
tp=(2,3,4)
for i in tp:
    print(i)
~~~
>Dica: Tupla fica dentro de **( )**, lista fica dentro de **[ ]** e dicionário fica entre **{ }**. 
~~~python
#Criando uma lista e imprimindo cada um dos valores
Lista = ["café","pão","queijo"]
for i in Lista:
    print(i)
~~~

~~~python
#imprimindo os valores no intervalo entre 0 e 5
for contador in range(0,5):
    print(contador)
~~~
>O range é uma estrutura de repetição e nos permite criar um faixa de valores.



utilizando o laço **for** com o condicional **if**:
~~~python
#Imprimindo na tela os números pares da lista de números
lista = [1,2,3,4,5,6,7,8,9,10,11,12]
for numero in lista:
    if (numero % 2 == 0):
        print(num)

~~~


~~~python
# Listando os números no intervalo entre 25 e 65, com incremento em 3
for i in range(25,65,3):
    print(i)
~~~
Imprime caractere por caractere da string
~~~python
# String também são sequências
for caracter in 'Python é uma linguagem de programação divertida!':
    print(caracter)

~~~


### Loops Aninhados



~~~python
#Loops aninhados
for i in range(0,5):
    for a in range(0,5):
        print(a)

~~~

Nesse caso nos teremos como resultado uma matriz de 5 linha e 5 colunas variando de 0 a 4


~~~python
# Operando os valores de uma lista com loop for 

listaB = [32,53,85,10,15,17,19]
soma = 0
for i in listaB:
    double_i = i*2
    soma += double_i
print(soma)
~~~
Aqui está fazendo duas operações dentro do **for**, ao percorrer a lista 
a variável **double_i** está recebendo o valor de cada item vezes 2 e depois a variável **soma** está somando o valor de **double_i** com o valor anterior de **soma**. o resultado final é **462** que é a soma de cada item na lista vezes 2.
~~~python
#contando os itens de uma lista
lista = [5,6,12,54,99]
count = 0
for item in lista:
    count +=1
print(count)
~~~
Irá retornar **5**


### Estrutura de Repetição Loop While

O loop while em Python é uma das formas mais comuns para executar itereção.
A instrução **while** que significa "enquanto" em português será executada repetidamente, seja uma única instrução ou um grupo de instruções, desde que uma condição seja verdadeira.

~~~python
while(expressão1)
    print("comando executado caso a expressão1 seja Verdadeira")
~~~
É importante lembrar que caso não exista dentro do loop while nenhuma manipulação para alterar o nível lógico da expressão1 sair de verdadeiro e ir para falso o loop nunca irá terminar! gerando assim o famoso loop infinito.

### Alguns exemplos utilizando **while**:

~~~python
#usando o loop while para imprimir os valores de 0 a 9
counter = 0
while (counter < 10):
    print(counter)
    counter = counter + 1
~~~
Nesse caso o comando counter dentro do while é incrementado até chegar na condição falsa de que counter é menor do que 10 e então saia do loop. Caso o a variável couter não fosse incrementada o loop while nunca iria terminar! 


## Pass, Break e Continue


Podemos utilizar essas palavras reservadas para mudar o comportamento do loop




~~~python
counter = 0
while counter <100:
    if counter == 4:
        break
    else:
        pass
    print(counter)
    counter = counter + 1
~~~
Quando counter for igual a 4 o fluxo irá sair do while devido ao comando  **break** e o comando pass não executa nada apenas preenche uma lacuna do else . Assim teremos como resultado 0,1,2 e 3.

~~~python
for verificador in "Python":
    if verificador == "h":
        continue
    print(verificador)
~~~
O **continue** deverá continuar a execução do **for**, que quando encontrar um item igual a h, passará para a próxima iteração. E recebemos o resultado sem o h, assim, teremos na saída: **Pyton**


## Métodos
Nós já vimos alguns exemplos de métodos quando aprendemos sobre Estrutura de Dados em Python no capítulo 2. Os métodos são essencialmente funções incorporadas em objetos.

No capítulo 4, vamos aprender sobre como criar nossos próprios métodos que utilizam Programação Orientada a Objetos (POO) e classes.

Métodos permitem executar ações específicas no objeto e podem também ter argumentos, exatamente como uma função.Os métodos são executados sob a forma:
>objeto.método ( argumento1, argumento2, etc...)

O objetivo principal do método é você ter operações, ações que podem ser executadas em cada objeto.

Com Jupyter Notebook podemos ver rapidamente todos os métodos possíveis para um objeto, usando a tecla TAB. Por exemplo, os métodos para o objeto lista são:
- append
- count
- extend
- insert
- pop
- remove
- reverse
- sort
## Alguns exemplos utilizando Métodos:
~~~python
# Criando uma lista
lst = [100, -2, 12, 65, 0]
~~~

~~~python
#usando um método do objeto lista que permite adicionar um elemento na lista
lst.append(10)
~~~
Nesse caso a lista irá ficar:  **[100, -2, 12, 65, 0, 10]**
~~~python
#usando um método do objeto lista 
lst.count(10)
~~~
Tendo como saída: **1**


~~~python
# A função help() explica como utilizar cada método bastando passar entre 
# parametro o nome do objeto e o nome do metodo que você quer conhecer melhor

help(lst.count) 
~~~
Tendo como resultado:
~~~
Help on built-in function count:

count(value, /) method of builtins.list instance
    Return number of occurrences of value.
~~~
~~~python
# O método de um objeto pode ser chamado dentro de uma função, como print()
a = 'Isso é uma string'
print(a.split())
~~~

Tendo como saída:
>['Isso', 'é', 'uma', 'string']
~~~python
# A função dir() mostra todos os métodos e atributos de um objeto

dir(lst)
~~~

Tendo como resultado:
~~~
['__add__',
 '__class__',
 '__contains__',
 '__delattr__',
 '__delitem__',
 '__dir__',
 '__doc__',
 '__eq__',
 '__format__',
 '__ge__',
 '__getattribute__',
 '__getitem__',
 '__gt__',
 '__hash__',
 '__iadd__',
 '__imul__',
 '__init__',
 '__init_subclass__',
 '__iter__',
 '__le__',
 '__len__',
 '__lt__',
 '__mul__',
 '__ne__',
 '__new__',
 '__reduce__',
 '__reduce_ex__',
 '__repr__',
 '__reversed__',
 '__rmul__',
 '__setattr__',
 '__setitem__',
 '__sizeof__',
 '__str__',
 '__subclasshook__',
 'append',
 'clear',
 'copy',
 'count',
 'extend',
 'index',
 'insert',
 'pop',
 'remove',
 'reverse',
 'sort']
~~~
## Funções

Vamos agora estudar o que é uma função em Python. As Funções serão um dos nossos principais recursos, quando construírmos quantidades cada vez maiores de código para resolver problemas a utilização de funções terá uma grande vantagem em reutilização de código.

Função em sua essência é uma relação entre o conjunto de entrada e o conjunto saída e na programação basicamente ela é um dispositivo que agrupa um conjunto de instruções para que elas possam ser executadas mais de uma vez.

Funções em Python são uma forma de escrever a sua lógica em único pacote e utilizá-la em diferentes lugares no seu código e quantas vezes quiser.

O formato geral de uma função em é:

~~~python
def nome da função(argumento1, argumento2,etc,...):
    '''Aqui vão os comentários, documentando sua função '''
    <Aqui vai seu código>
    <Retorno desejado pela função>

~~~
Para chamar a função basta chama-lá pelo nome e passar os argumentos se assim ela tiver.

Uma função recebe como entrada Argumentos além de variáveis globais e Arquivos/Streams de Dados. Uma função pode conter variáveis locais(usadas apenas internamente dentro da função) o código dentro será executado e irá gerar uma ou mais saídas que pode ser um resultado específico, variáveis globais, Arquivos/Streams de Dados.

### Exemplo de Funções em python

### Exemplo 1 :
~~~python
# Definindo uma função
def primeiraFunc():
    print('Hello World')


primeiraFunc()
~~~
Terá como saída ao chamar a função:
>Hello World



### Exemplo 2 :
~~~python
# Definindo uma função com parâmetro
def segundaFunc(nome):
    print('Hello %s' %(nome))

#chamando a função criada e passando a string Aluno como parâmetro 
segundaFunc('Aluno')
~~~
Terá como saída ao chamar a função:
>Hello Aluno



### Exemplo 3 :
~~~python
# Função para somar números
def addNum(primeiroNumero,segundoNumero):
    print("primeiro Numero: "+ str(primeiroNumero))
    print("segundo Numero: " + str(segundoNumero))
    print("Soma:",primeiroNumero + segundoNumero)

#Chamando a função e passando 2 parâmetros
addNum(5,79)
~~~
>A função **str()** serve para retornar representações de valores que sejam legíveis para as pessoas.

Teremos como saída ao chamar a função addNum e passar 5 e 79 como parâmetros:
~~~
primeiro Numero: 5
segundo Numero: 79
Soma: 84
~~~
### Exemplo 4 - Variáveis locais e globais :



~~~python
#Variável Global
var_global = 10  #Esta é uma variável global

def multiplicar(num1,num2):
    var_global = num1 * num2  # Esta é uma variável local
    print(var_global)
~~~


~~~python
multiplicar(5,35)
~~~
Teremos como saída ao chamar a função multiplicar e passar 5 e 35 como parâmetros:
>175

E não 10, porque, a função imprimiu a variável local e não avariavel global. Agora para verificarmos o valor da variável global:
~~~python
print(var_global)
~~~
Teremos como saída:
>10

no caso anterior aconteceu da variável ter dois valores, porque, ela tinha o mesmo nome e era usada tanto fora da função(Variável global), como também dentro da função(variável local). Agora se colocássemos um nome diferente e tentarmos imprimir uma variável local fora da função então o interpretador python irá retornar um erro. Vejamos:

~~~python
#Variável Global
var_global = 10  #Esta é uma variável global

def multiplicar(num1,num2):
    var_local = num1 * num2  # Esta é uma variável local
    print(var_global)
~~~
Se tentarmos imprimir **var_local** fora da função multiplicar:
~~~python
print(var_local)
~~~

Teremos como saída um erro, porque, **var_local** não existe fora da função multiplicar:
~~~
---------------------------------------------------------------------------
NameError                                 Traceback (most recent call last)
<ipython-input-14-c03b090c34bc> in <module>
      5     print(var_global)
      6 
----> 7 print(var_local)

NameError: name 'var_local' is not defined
~~~

>Uma boa prática de programação é não colocar o mesmo nome de uma váriavel global em uma variável local.


### Exemplo  - Funções Buit-in :

São funções que já vem na linguagem python quando você faz a instalação do interpretador 

Função **abs** para retornar o valor absoluto:

~~~python
abs(-78)
~~~
Tem como retorno:
>78

~~~python
abs(78)
~~~
Tem como retorno:
>78

Função **bool** para retornar um valor booleano:
~~~python
bool(0)
~~~
Tem como retorno:
>False


~~~python
bool(1)
~~~
Tem como retorno:
>True


### Exemplo  - Funções str, int, float


~~~python
# Erro ao executar por causa da conversão
idade = input("digite sua idade:")
if idade>10:
    print("Você pode acessar o Instagram")
~~~
Tem como retorno ao digitar qualquer numero:
~~~
---------------------------------------------------------------------------
TypeError                                 Traceback (most recent call last)
<ipython-input-15-f0c9fec04367> in <module>
      1 idade = input("digite sua idade:")
----> 2 if idade>10:
      3     print("Você pode acessar o Instagram")

TypeError: '>' not supported between instances of 'str' and 'int'
~~~

~~~python
#Usando a função int para converter o valor digitado
idade = int(input("digite sua idade:"))
if idade>10:
    print("Você pode acessar o Instagram")
~~~
Tem como retorno ao digitar qualquer numero(como por exemplo 26):
>Você pode acessar o Instagram


Função **float** que converte string em float:
~~~python
float("123.589")
~~~
Tem como retorno:
>123.589

 Função **str** que converte um valor numérico para uma string :
~~~python
str(5689)
~~~
Tem como retorno:
>' 5689 '

E assim por diante, basta você consultar a documentação do Python e pesquisar sobre as funções Built-in e assim evitar de construir uma função que já é disponibilizada pelo próprio python (Reinventando a roda).Para verificar as funções **Built-in** do python versão 3.6 você pode acessar:

https://docs.python.org/pt-br/3.6/library/functions.html




### Exemplo  - Criando Funções usando outras Funções


~~~python
import math  # importando o pacote math que contém várias funções matemáticas

def numPrimo(num):
# Verificando se um número é Primo.
    if (num % 2) == 0 and (num > 2):
        return "Este número não é primo!"
    for i in range(3, int(math.sqrt(num))+1,2):
        if (num % i) ==0:
            return "Este número não é primo!"
    return "Este número é Primo!"


~~~
A função **sqrt** do pacote **math** serve para obter a raiz quadrada da variável **num**

Chamando a função e passando como paramêtro o valor 541 
~~~python

numPrimo(541)

~~~

temos como retorno:
>'Este número é Primo!'





# Não pare por aqui! Vá para o capitulo 4 para aprender mais sobre Python!


https://github.com/Talita1996/ES3-Projeto_Final/tree/master/cap%204%20-%20Orienta%C3%A7%C3%A3o%20a%20objetos







