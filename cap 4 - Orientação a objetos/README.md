# Orientação a Objetos em Python

![POO](/assets/poo.png)

A essa altura do curso, você já deve saber:
- como criar e operar variáveis em Python
- como criar e operar estruturas de dados nativas do Python (Listas, Tuplas e dicionários)
- como criar e usar funções em Python

Neste módulo, você aprenderá sobre como funciona a orientação a objetos em Python. Verá:
 - Como criar classes em Python
 - Como intanciar classes em Python
 - Como criar e usar atributos em Python
 - Como criar e usar métodos em Python
 - Como contruir um encapsulamento em Python
 - Como utilizar herança em Python
 - Peculiaridades do Python

### Introdução

```python
class  FirstClass:
    def  helloWorld(self):
        return  "Olá! Eu um objeto!"
```
Por princípio, entenda, Python incorpora ao menos três paradigmas de programação. A Programação imperativa, e A Funcional são dois deles, mas o principal, no qual todas as bases da linguagem se instala é a Programação Orientada a Objetos.
```python
type(3)
```
> &lt;class 'int'&gt;

É importante você saber que todos os identificadores em Python são considerados objetos (Variáveis, Funções, Classes). Sendo assim, possuem métodos, atributos, são instanciados de acordo com a sua classe assim como qualquer linguagem Orientada a Objetos.

```python
a = 3
dir(a)
```
> ['\_\_abs\_\_', '\_\_add\_\_', '\_\_and\_\_', '\_\_bool\_\_', '\_\_ceil\_\_', '\_\_class\_\_', '\_\_delattr\_\_', '\_\_dir\_\_', '\_\_divmod\_\_', '\_\_doc\_\_', '\_\_eq\_\_', '\_\_float\_\_', '\_\_floor\_\_', '\_\_floordiv\_\_', '\_\_format\_\_', '\_\_ge\_\_', '\_\_getattribute\_\_', '\_\_getnewargs\_\_', '\_\_gt\_\_', '\_\_hash\_\_', '\_\_index\_\_', '\_\_init\_\_', '\_\_init_subclass\_\_', '\_\_int\_\_', '\_\_invert\_\_', '\_\_le\_\_', '\_\_lshift\_\_', '\_\_lt\_\_', '\_\_mod\_\_', '\_\_mul\_\_', '\_\_ne\_\_', '\_\_neg\_\_', '\_\_new\_\_', '\_\_or\_\_', '\_\_pos\_\_', '\_\_pow\_\_', '\_\_radd\_\_', '\_\_rand\_\_', '\_\_rdivmod\_\_', '\_\_reduce\_\_', '\_\_reduce_ex\_\_', '\_\_repr\_\_', '\_\_rfloordiv\_\_', '\_\_rlshift\_\_', '\_\_rmod\_\_', '\_\_rmul\_\_', '\_\_ror\_\_', '\_\_round\_\_', '\_\_rpow\_\_', '\_\_rrshift\_\_', '\_\_rshift\_\_', '\_\_rsub\_\_', '\_\_rtruediv\_\_', '\_\_rxor\_\_', '\_\_setattr\_\_', '\_\_sizeof\_\_', '\_\_str\_\_', '\_\_sub\_\_', '\_\_subclasshook\_\_', '\_\_truediv\_\_', '\_\_trunc\_\_', '\_\_xor\_\_', 'as_integer_ratio', 'bit_length', 'conjugate', 'denominator', 'from_bytes', 'imag', 'numerator', 'real', 'to_bytes']

Não é nosso intuito que você se assuste com a saída do comando. Esta é uma lista dos métodos da classe <span style="color:#690">int</span>. Os métodos iniciados e terminados por '\_\_' são chamados de métodos mágicos e serão explicados mais adiante. Neste momento, só queremos mostrar que todos os identificadores, de todos os tipos, representam um objeto em Python.

Como exercício, você pode criar variaveis de outros tipos, que você ja conheça e realizar as mesmas operações:
```python
identificador = "Hello World!"
type(identificador)
dir(identificador)
```
```python
def identificador():
    return "Hello World"!
type(identificador)
dir(identificador)
```

### Criando Classes
Para demonstrar o funcionamento da orientação a objeto, serão apresentadas comparação com a linguagem Java, comum, por ser um exemplo comum de Orientação a objetos.

**Objetos** nada mais são do que Instancias de uma Classe. **Classes** são a base, ou o molde, de como serão os objetos que serão feitos dela. **Instancias** são como se fossem _unidades_ de um tipo, ou uma classe. Cada unidade possui _caracteristicas próprias_, ou **Atributos**,  mas sempre terá _comportamentos_, ou **Métodos**,  iguais às outras _unidades_ do mesmo tipo, ou seja, sempre terá **Métodos** iguais aos outros **Objetos** da mesma **Classe**.

Objetos possuem **Construtores** que são chamados ao criar o objeto para realizar as primeiras operações. São usados para inicializar o objeto, de acordo com a necessidade. Mais adiante será explicado mais a fundo.

A baixo, segue o código para a criação de uma Classe em Java e em Python.

##### Java
```Java
class PrimeiraClasse{
}

class SegundaClasse{
    public SegundaClasse(String attr){
        // Contrutor em java 
        // método com o mesmo nome da classe
    }
}
```
##### Python
```python
class PrimeiraClasse:
    pass

class SegundaClasse:
    def __init__(self, attr):
        # Contrutor em Python
        # método com o nome '__init__'
    
```

A estrutura de criação de Classes é muito semelhante à criação de funções em Python. A sintaxe do python de definir inicio de um bloco de código pelo caractere ':' e o comprimento do bloco pela identação ainda se aplica aqui.

Quanto à diferença do construtor, em python o contrutor é criado ao criar um método com o nome **\_\_init\_\_**. O parâmetro **self** no construtor será explicado melhor posteriormente, mas por hora, digamos que faça parte da sintaxe.

### Instanciando Classes
Com a classe criada, instanciar objetos é um processo igual ou semelhante à criação de qualquer outra variável. Deve ser escolhido um identificador, ou uma estrutura de dados, que receberá o objeto criado. Nessa criação podem ser passados parametros de criação. Na subseção contrutor da seção métodos mágicos será explicado definí-los.

Seguem alguns exemplos de instanciação de objetos em Java e em Python.

##### Java
```Java
...
PrimeiraClasse pc = new PrimeiraClasse();
SegundaClasse sc = new SegundaClasse("Classe xingling");
...
```
##### Python
```python
...
pc = PrimeiraClasse()
sc = SegundaClasse("Classe xingling")
...

```

Observe a diferença de sintaxe. Em python, da mesma forma que antes, os tipos não são anunciados, apenas atribuidos, graças à Tipagem Dinâmica do Python. A palavra reservada **new** de outras linguagens não se aplica a python.

### Atributos

Classes podem possuir atributos. Atributos são variáveis que se encontram "dentro" do objeto ou da classe, dependendo desses para serem acessados. Existem dois tipos de atributo:
 - Dinâmicos ou de Objetos
 - Estáticos ou de Classe

Atributos Dinâmicos são os pertencem ao objeto. Cada objeto poderá ter valores diferentes para cada atributo dinâmico. Para ser acessado, deve ser vinculado a um objeto instanciado da Classe.

Atributos Estáticos são os que pertencem à Classe. São variaveis que se encontram dentro do contexto da Classe, mas se comportam como variáveis globais. Podem ser alteradas, mas sempre terá o mesmo valor independentemente de qual objeto a referencie. Podem ser acessados atraves dos objetos ou também pelo identificador da própria classe.

A seguir, serão apresentados os dois tipos de atributos para as linguagens Java e Python.
##### Java
```Java
class TerceiraClasse{
    public static String atributoEstatico;
    public String atributoDinamico;
}
```
##### Python
```python
class TerceiraClasse:
    atributoEstatico = ""

    def __init__(self, attr):
        self.atributoDinamico = attr
```

A palafra **self** em Python faz um trabalho parecido com o **this** em Java. Refere-se sempre à instancia do objeto nos métodos dinâmicos, e também nos contrutores.

Atributos Dinâmicos em Python são criados ao chamar atraves de um objeto, um identificador ainda não usado, e atribuir a este algum valor.

Pelo fato de python ser de Tipagem Dinâmica, atributos dinâmicos podem ser criados a qualquer momento após a instanciação, dentro ou fora da classe. Diferentemente de Java que os atributos são previamente definidos na classe, e sua quantidade e tipos não podem ser alterados.

Neste caso, como o atributo foi criado no contrutor, todos os objetos dessa classe terão esse atributo.

### Métodos

Métodos também são chamados de comportamentos de um objeto, são as funções que são criadas dentro da classe para serem usadas atraves do objeto. Assim como os atributos, existem dois tipos de métodos:
 - Métodos dinâmicos ou de Objeto
 - Métodos estáticos ou de Classe

Métodos dinâmicos são funções que só podem ser chamadas quando vinculadas à um objeto ou instância da Classe.

Métodos estáticos são funções que não precisam estar vinculadas a um objeto. Podem ser chamados atraves dos objetos ou também pelo identificador da própria classe.

A seguir são apresentados os dois tipos de métodos nas linguagens Java e Python

##### Java
```Java
class QuartaClasse{

    public String metodoDinamico(){     // Criação do método 1
        return "Este é um método dinâmico"
    }

    public static String metodoEstatico(){      // Criação do método 2
        return "Este é um método estático"
    }
}
```

##### Python
```python
class QuartaClasse:                                # Criação da classe
    def metodoDinamico(self):     # Criação do método dinâmico
        return "Este é um método dinâmico"    
    @staticmethod
    def metodoEstatico():         # Criação do método estático
        return "Este é um método estático"
    
```

Em python, todos os métodos dinâmicos são de fato representados pelo parametro convencionado **self** passado na primeira posição. O nome **self** pode ser substituido por qualquer outro identificador, mas o padrão do python indica que seja esse nome.

Métodos estáticos não precisam da anotação **@staticmethod**. Essa anotação apenas suprime um Warning que o interpretador do python devolve sempre que um método é criado sem nenhum parâmetro (as vezes sem que o primeiro parâmetro se chame self). O que de fato define que um método é dinâmico ou não é o objeto passado no primeiro parâmetro. Na verdade, para o python, as duas formas a seguir de chamar um método são equivalentes. 

```Python
o = QuartaClasse()
print(o.metodoDinamico())
print(QuartaClasse.metodoDinamico(o))
```
> Este é um método dinâmico <br>
> Este é um método dinâmico

### Encapsulamento

Encapsulamento é um dos coneitos base da Orientação a Objetos. Consiste em tornar atributos ou métodos inacessíveis no contexto externo ao próprio objeto ou classe. O encapsulamento permite definir um atributo ou método como 
 - privado, 
 - protegido ou 
 - público.

Os publicos são livremente acessados por qualquer contexto.

Os privados são acessados unicamente dentro dos métodos da própria classe.

Os protegidos são acessiveis pelo pacote que a classe se encontra, mas não fora dele.

O python usa uma convenção de métodos protegidos conterem "_" no inicio do nome, enquanto os privados contém "__". 

O acesso à atributos protegidos ou privados pode ser feito atraves dos métodos do objeto. Para esse fim, quando a funcionalidade é direta sobre os atributos, pode ser criado métodos especiais chamados comumente de GET/SET.

A seguir são apresentados os três tipos de encapsulamento e os dois métodos e os dois métodos de acesso em Java e Python.

##### Java
```Java
class QuintaClasse{
    public String atributoPublico;
    private String atributoPrivado;
    protected String atributoProtegido;

    public String getAtributoPublico(){
        return this.atributoPublico;
    }

    public void setAtributoPublico(String atributoPublico){
        this.atributoPublico = atributoPublico;
    }

    public String getAtributoPrivado(){
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado){
        this.atributoPrivado = atributoPrivado;
    }

    public String getAtributoProtegido(){
        return this.atributoProtegido;
    }

    public void setAtributoProtegido(String atributoProtegido){
        this.atributoProtegido = atributoProtegido;
    }
}
```
##### Python
```python
class QuintaClasse:
    def __init__(self):
        atributoPublico = ""
        __atributoPrivado = ""
        _atributoProtegido = ""
    
    @property
    def atributoPrivado(self): 
        return self.__atributoPrivado

    @atributoPrivado.setter
    def atributoPrivado(self, atributoPrivado):
        self.__atributoPrivado = atributoPrivado

    @property
    def atributoPrivado(self): 
        return self.__atributoPrivado

    @atributoPrivado.setter
    def atributoPrivado(self, atributoPrivado):
        self.__atributoPrivado = atributoPrivado
```

Não foram apresentados métodos com encapsulamento privado ou protegido mas o funcionamento em ambas as linguagens é o mesmo para métodos e atributos.

Já foi comentado neste curso sobre o jeito pytonianico de fazer as coisas. Há um detalhe muito importante sobre isso que precisa ser mostrado neste momento, mas mais detalhes sobre isso serão mostrados mais adiante. Para entender essa diferença, observe o uso dos GET/SET e dos atributos abaixo.

##### Java
```Java
...
QuintaClasse qc = new QuintaClasse();

qc.atributoPublico = "publico";
qc.atributoPrivado = "privado"; // Gera erro
qc.atributoProtegido = "protegido"; // Gera erro

qc.setAtributoPublico = "Publico";
qc.setAtributoPrivado = "Privado";
qc.setAtributoProtegido = "Protegido";

System.out.println(qc.atributoPublico);
System.out.println(qc.getAtributoPublico());
System.out.println(qc.getAtributoPrivado());
System.out.println(qc.getAtributoProtegido());
System.out.println(qc.atributoProtegido); // Gera Erro
System.out.println(qc.atributoPrivado); // Gera Erro
...
```
##### Python
```python
...
qc = QuintaClasse()

qc.atributoPublico = "Publico"

qc.__atributoPrivado = "privado" # Gera Erro
qc._atributoProtegido = "protegido" # não gera erro

qc.atributoPrivado = "Privado"
qc.atributoProtegido = "Protegido"

print(qc.atributoPublico)
print(qc.atributoPrivado)
print(qc.atributoProtegido)
print(qc._atributoProtegido) # Não gera erro
print(qc.__atributoPrivado) # Gera Erro
...
```

Nessa comparação, pode ser observado que a forma de chamar os métodos Get/Set na linguagem python se altera nativamente. Nele, a chamada do método como se fosse um atributo realiza a operação, de get ou de set. Os atributos ou métodos privados são identificados pelos caracteres '__' no inicio do nome. Já os protegidos, em Python, são apenas uma convenção de boas práticas, no qual não se indica iniciar nomes de atributos e métodos com '_' a não ser que não sejam para ser acessados externamente. Dessa forma, não há uma restrição técnica para o uso de métodos ou atributos iniciados por '_' e convencionados como protegidos, apenas uma indicação para não fazer isso.

Pelo fato dos métodos GET/SET serem usados dessa forma, em python não se faz get/set para atributos públicos, como pode ser feito para o Java, por mais que em ambos os casos não seja uma prática indicada.
### Herança

Herança é o conceito de orientação a objetos que vincula todas as caracteristicas de uma classe a outra, tendo o foco na reutilização de códigos e modularização de recursos.

Basicamente, todas os atributos e métodos que pertencem a uma Classe herdada, passam a pertencer à classe que herdou. Os métodos podem ser sobrescritos, definindo comportamentos específicos para as classes que recebem a herança.

A seguir são apresentados os exemplos de herança para as linguagens Java e Python.

##### Java
```Java
class ClassePai{
    public String metodoDoPai(){
        return "Método do pai";
    }

    public String posicaoFamiliar(){
        return "Pai";
    }
}

class ClasseFilha extends ClassePai{ // Sintaxe da herança em java
    public String metodoDoFilho(){
        return "Método do filho";
    }

    public String posicaoFamiliar(){
        return "Filho";
    }
}
```
##### Python
```python
class ClassePai:
    def metodoDoPai(self):
        return "Método do pai"
    
    def posicaoFamiliar(self):
        return "Pai"

class ClasseFilha(ClassePai): # sintaxe da herança em Python
    def metodoDoFilho(self):
        return "Método do Filho"
    
    def posicaoFamiliar(self):
        return "Filho"
```

O uso de ambos os casos é equivalente em todos os aspectos, o exemplo de utilização é apresentado abaixo:

##### Java
```Java
...
ClassePai cp = new ClassePai();
ClasseFilha cf = new ClasseFilha();

System.out.println(cp.metodoDoPai());

System.out.println(cf.metodoDoPai()); // Método Herdado
System.out.println(cf.metodoDoFilho());

System.out.println(cp.PosicaoFamiliar());
System.out.println(cf.PosicaoFamiliar()); // Método Sobrescrito
...
```
> Método do pai<br>
> Método do pai<br>
> Método do Filho<br>
> Pai<br>
> Filho<br>
##### Python
```python
...
cp = ClassePai()
cf = ClasseFilha()

print(cp.metodoDoPai())

print(cf.metodoDoPai()) # Método Herdado
print(cf.metodoDoFilho())

print(cp.PosicaoFamiliar())
print(cf.PosicaoFamiliar()) # Método Sobrescrito
...
```
> Método do pai<br>
> Método do pai<br>
> Método do Filho<br>
> Pai<br>
> Filho<br>

A herança abre espaço para o conceito de **Classes Abstratas**. Essas são classes que não podem ser instanciadas, apenas herdadas. Servem para criar uma preconfiguração, mas que não funciona sozinha, que precisa ser especificada de alguma forma. Essas classes permitem a criação de **Métodos Abstratos**. Esses são criados nas classes abstratas com o intuito de serem definidos nas classes filhas.

A seguir será mostrado como criar classes abstratas com métodos abstratos em Python e em Java.

##### Java
```Java
abstract class PrimeiraClasseAbstata{
}

abstract class SegundaClasseAbstrata{
    public abstract String metodoAbstrato();
}
```
##### Python
```python
from abc import ABC, abstractmethod

class PrimeiraClasseAbstrata(ABC):
    pass

class SegundaClasseAbstrata(ABC):

    @abstractmethod
	def metodoAbstrato(self):
		pass

```

Em python, para criar uma classe abstrata, ela deve herdar da classe ABC do pacote abc. Esta cria as anotações necessárias para a definição da classe como abstrata. Diferentemente do Java, python não possui a abstração das classes imbutida na sintaxe.

Para usar essas classes, é necessário realizar a herança para uma Classe. Essa classe filha pode ou não ser abstrata, mas a instancia da classe só poderá ocorrer em cima de uma classe não abstrata.

Para as classes abstratas que possuem métodos abstratos, a herança obriga a implementação desses métodos se a classe que herdar não for abstrata. Se a classe que realizar a herança for abstrata, não é obrigatória a definição dos métodos.

### Outras Diferenças

Já falamos neste tutorial sobre o jeito Pythonianico. De fato, a linguagem python possui muitas particularidades que faz dela única. Apesar de ser uma linguagem orientada a objetos, nem todas as caracteristicas encontram uma semelhança clara. Sâo linguagens diferentes, e a tradução não pode ser feita ao pé da letra, alguns recursos precisam ser interpretados e remodelados para funcionar em python. Alguns deles serão apresentados nesta seção.
#### Polimorfismo

Você aprendeu que python possui Tipagem Forte, mas dinâmica. Nenhuma variavel carrega consigo a obrigação de ser para sempre de um tipo, mas não pode ser usada se o seu tipo não for compativel com a operação.

Por conta disso, o conceito de Polimorfismo que é tão presenta na linguagem Java e na teoria de Orientação a Objetos, se torna trivial em Python. Não é visto propriamente dito porque desde o inicio, tudo é feito com polimofismo.

Se todos os identificadores são considerados objetos, é como se todos fossem do tipo Objeto, e por isso podem ser instanciados por qualquer classe. Se fosse feita uma comparação, seria algo parecido com o código Java a seguir.

##### Java
```Java
public class Teste{
    public static void main(String[] args){
        Object a;
        Object b;

        a = new Integer(3);

        System.out.println(a);
        System.out.println(a.getClass().getName());

        a = new Float(3.5);

        System.out.println(a);
        System.out.println(a.getClass().getName());

        a = "String a";
        b = "String b";

        System.out.println(a);
        System.out.println(a + "; "+ b);
        System.out.println(a.getClass().getName());
    }
}
```
> 3<br>
> java.lang.Integer<br>
> 3.5<br>
> java.lang.Float<br>
> String a<br>
> String a; String b<br>
> java.lang.String

A grande diferença é que tudo isso a linguagem Python faz de forma implícita, mas o funcionamento é o mesmo, todos os identificadores são antes de tudo objetos de uma classe principal, e a partir dela, todos os outros objetos podem ser instanciados.
#### Sobrecarga

Este conceito é aplicado na linguagem Java gerando a possibilidade de possuir métodos com o mesmo nome, mas com numero ou tipos de parametros diferentes. Com isso ele soluciona a necessidade de criar um comportamento para cada tipo de entrada.

Ja na linguagem Python, esse conceito não se aplica. Na verdade, o python soluciona isso de uma forma diferente. De fato não é necessário criar um método para cada tipo de entrada, e nem mesmo ficar sem resolver o problema. Você deve ter aprendido que em python é possivel criar funções com uma lista de parâmetros muito flexivel. A própria tipagem dinâmica ja soluciona parte do problema, mas com as opções de parametros obrigatorios, opcionais e não definidos é possivel criar uma gama de possibilidades ainda maior.

Facilmente é possivel criar uma lista parametros nomeados ou não, tipados ou não, e utiliza-los de acordo com a demanda dentro da função, e por isso a sobrecarga não é necessária.

Ao passo que em Java, verificar a quantidade de parametros e o tipo de cada um não é necessário porque o método ja garante isso, para cada variação de entrada, é necessário criar um método completamente novo.

Ja em Python essa verificação é necessária, e pode parecer mais custoso, mas se torna mais escalável.

Abaixo serão apresentados dois exemplos, um que favorece a linguagem Python e outro que favorece à linguagem Java.

##### Java
```Java
class ClasseSobrecarregada{
    public int metodoMelhorEmPython(int a, int b){
        return a+b;
    }

    public String metodoMelhorEmPython(String a, String b){
        String a+b;
    }

    public float metodoMelhorEmJava(Circle x){ // Calcula área
        return Math.pow(x.raio,2) * Math.PI;
    }

    public float metodoMelhorEmJava(Retangulo x){ // Calcula área
        return x.largura * x.altura;
    }
}
```
##### Python
```python
import math
class ClasseSobrecarregada:
    def metodoMelhorEmPython(self, a,b):
        return a+b

    def metodoMelhorEmJava(self, x):
        if type(x) == Circle:
            return  x.raio ^ 2 * math.pi
        elif type(x) == Retangulo:
            return x.largura * x.altura
```

O método chamado **metodoMelhorEmPython** recebe esse nome pela vantagem da tipagem dinâmica, como a entrada não define quais tipos devem ser, a operação é feita para cada tipo de acordo com o seu comportamento para ela, ja em Java, a operação é capaz de fazer isso, mas a entrada da função não, então, são necessários quantos metodos quantos forem os tipos de entrada.

O método chamado **metodoMelhoEmJava** recebe esse nome pela vantagem da tipagem explicita. Com a entrada definida, quando as operações são diferentes, a verificação não é posta como parte da lógica de programação, tornando a leitura da função mais simples e direta.

#### Métodos mágicos

Esse, em minha opinião, é um dos recursos mais apaixonantes para quem gosta da orientação a objetos. Não é apenas python que implementa esse recurso, mas não é um recurso comum de ser encontrado em outras linguagens.

Também chamado de métodos especiais, consiste em implementar métodos com um nome específico que será chamado "por debaixo dos panos" pelo próprio interpretador ao utilizar alguns recursos da própria linguagem.

O próprio java faz isso com métodos como o tostring, que quando o objeto é convertido para String, ou apenas usado em um contexto em que essa conversão é implicita, essa função é chamada, executando todas as operações necessárias para tornar aquele objeto em uma String.

A mesma ideia é encontrada em python, mas com uma quantidade de opções incomparável. Ele permite definir a operação de soma, subtração, multiplicação, divisão, potenciação, atribuição, etc, para cada objeto criado. Essas são usadas com os operadores da sintaxe, simplificando ainda mais a leitura do código.

Abaixo será apresentada a solução em Java e Python para a criação de uma estrutura de dados e suas operações. As implementações em  não serão feitas para não perder o foco do que se deseja ser mostrado.

##### Java
```Java
class Polinomio{
    private float[] coeficientes;
    public Polinomio(int ordem){
        // ... implementação ...
    }

    public Polinomio(float [] coeficientes){
        // ... implementação ...
    }

    public Polinomio soma(Polinomio p){
        // ... implementação ...
    }

    public Polinomio multiplicacao(Polinomio p){
        // ... implementação ...
    }

    public String toString(){
        // ... implementação ...
    }
}
```
##### Python
```python
class Polinomio:
    def __init__(self, *args, **kwargs):
        # ... implementação ...
        pass

    def __add__(self, p):
        # ... implementação ...
        pass

    def __mul__(self, p):
        # ... implementação ...
        pass
    def __str__(self):
        # ... implementação ...
        pass
```

A diferença clara não é na impelentação dos métodos, e sim no uso, repare bem como eles são usados:
##### Java
```Java
...
Polinomio a = new Polinomio({1.0,2.0});
Polinomio b = new Polinomio({1.0,-3.0,1.0});

Polinomio c = a.soma(b);
Polinomio d = a.multiplicacao(b);

System.out.println(c);
System.out.println(d);
...
```
##### Python
```python
...
a = Polinomio([1.0,2.0])
b = Polinomio([1.0,-3.0,1.0])

c = a + b
d = a * b

print(c)
print(d)
...
```

Logo no inicio deste capítulo, foi mostrado uma lista de nomes que certamente te assustou. Ela contém os métodos mágicos definidos para a classe de inteiros.

> '\_\_abs\_\_', '\_\_add\_\_', '\_\_and\_\_', '\_\_bool\_\_', '\_\_ceil\_\_', '\_\_class\_\_', '\_\_delattr\_\_', '\_\_dir\_\_', '\_\_divmod\_\_', '\_\_doc\_\_', '\_\_eq\_\_', '\_\_float\_\_', '\_\_floor\_\_', '\_\_floordiv\_\_', '\_\_format\_\_', '\_\_ge\_\_', '\_\_getattribute\_\_', '\_\_getnewargs\_\_', '\_\_gt\_\_', '\_\_hash\_\_', '\_\_index\_\_', '\_\_init\_\_', '\_\_init_subclass\_\_', '\_\_int\_\_', '\_\_invert\_\_', '\_\_le\_\_', '\_\_lshift\_\_', '\_\_lt\_\_', '\_\_mod\_\_', '\_\_mul\_\_', '\_\_ne\_\_', '\_\_neg\_\_', '\_\_new\_\_', '\_\_or\_\_', '\_\_pos\_\_', '\_\_pow\_\_', '\_\_radd\_\_', '\_\_rand\_\_', '\_\_rdivmod\_\_', '\_\_reduce\_\_', '\_\_reduce_ex\_\_', '\_\_repr\_\_', '\_\_rfloordiv\_\_', '\_\_rlshift\_\_', '\_\_rmod\_\_', '\_\_rmul\_\_', '\_\_ror\_\_', '\_\_round\_\_', '\_\_rpow\_\_', '\_\_rrshift\_\_', '\_\_rshift\_\_', '\_\_rsub\_\_', '\_\_rtruediv\_\_', '\_\_rxor\_\_', '\_\_setattr\_\_', '\_\_sizeof\_\_', '\_\_str\_\_', '\_\_sub\_\_', '\_\_subclasshook\_\_', '\_\_truediv\_\_', '\_\_trunc\_\_', '\_\_xor\_\_'

Não são os unicos métodos mágicos que existem na linguagem Python. Para mais informações, consulte a [documentação oficial](https://docs.python.org/3.8/reference/datamodel.html#special-method-names)

### Conlcusão

Neste capítulo você viu sobre Orientação a objetos em Python. Você aprendeu:
 - Como criar classes em Python
 - Como intanciar classes em Python
 - Como criar e usar atributos em Python
 - Como criar e usar métodos em Python
 - Como contruir um encapsulamento em Python
 - Como utilizar herança em Python
 - Peculiaridades do Python

Esperamos que agora você possa realizar projetos em python que utilizem orientação a objetos, e com o tempo seja capaz de se tornar fluente na linguagem python.