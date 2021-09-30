# Capitulo 3

## Loops



## Condicionais
O condicional if nos permite dizer ao computador para executar ações com base em um determinado conjunto de resultados. O **if** em inglês significa "Se" em português e o **else** significa senão. Então verbalmente, podemos imaginar que estamos dizendo ao computador:
>Se isso acontecer execute está ação. Senão execute esta outra ação.

### Exemplo simples de if e else em python:

~~~
    if (expressão 1):
        print("Comando executado caso a expressão 1 seja Verdadeira")
    else:
        print("comando executado caso a expressão 1 seja Falsa")
~~~

Caso tenha várias outras condições é aconselhável utilizar o comando **elif** ao invés de utilizar vários if else aninhado como por exemplo:

~~~
if (expressão 1):
    print("Comando executado caso a expressão 1 seja Verdadeira")
elif(expressão 2):
    print("comando executado caso a expressão 1 seja Falsa e a expressão 2 seja Verdadeira")
else:
    print("comando executado caso a expressão 1 seja Falsa e a expressão 2 seja Falsa")
~~~

Ao invés de:

~~~
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
~~~
if 9==9:
    print("Verdadeiro")
~~~
Irá retornar TRUE
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
~~~
x = 9
y = 10
z = 8

if(x>z) and (x<y):
    print("x é maior que z e é menor do que y")

~~~
Nesse caso irá ter como saída a mensagem: **x é maior que z e é menor do que y**.
#### Exemplo simples do operador **or**:
~~~
temperatura1 = 35
temperatura2 = 28

if(temperatura1 > 30) or (temperatura2 > 30):
    print("liga o Ar-condicionado!")
~~~
Nesse caso qualquer uma das duas condições se passar de 30 irá ligar o ar-condicionado. Logo como a temperatura 1 está maior do que 30 então terá como saída **ligar o Ar-condicionado!**


#### Exemplo simples do operador not
~~~
sensor1 = True

if(not sensor1):
    print("liga a esteira")
else:
    print("Desliga a esteira")
~~~
Nesse caso o resultado na saída será **Desliga a esteira**, porque, o operador lógico **not** irá inverter o valor lógico da variável **sensor1**, como a variável sensor1 está verdadeira então dentro do parâmetro do if por causa do operador not ela irá ser lida como falsa e não irá satisfazer a condição de verdadeiro para executar a primeira instrução.






## Funções








