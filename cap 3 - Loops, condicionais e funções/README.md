# Capitulo 3


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
#### Alguns exemplos utilizando **for**:

~~~python
# Criando uma tupla e imprimindo cada um dos valores
tp=(2,3,4)
for i in tp:
    print(i)
~~~
>Dica: Tupla fica dentro de **( )**, lista fica dentro de **[ ]** e dicionario fica entre **{ }**. 
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
>O range é uma estrutura de repetição em nos permite criar um faixa de valores.



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
Imprime caracter por caracter da string
~~~python
# String também são sequências
for caracter in 'Python é uma linguagem de programação divertida!':
    print(caracter)

~~~


#### Loops Aninhados



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

#### Alguns exemplos utilizando **while**:

~~~python
#usando o loop while para imprimir os valores de 0 a 9
counter = 0
while (counter < 10):
    print(counter)
    counter = counter + 1
~~~
Nesse caso o comando counter dentro do while é incrementado até chegar na condição falsa de que counter é menor do que 10 e então saia do loop. Caso o a variável couter não fosse incrementada o loop while nunca iria terminar! 


### Pass, Break e Continue


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

## Funções

~~~python

~~~

~~~python

~~~






