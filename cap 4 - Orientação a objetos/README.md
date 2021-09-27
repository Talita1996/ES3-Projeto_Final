![POO](/assets/poo.png)

# Orientação a Objetos em Python

A essa altura do curso, você já deve saber:
- como criar e operar variáveis em Python
- como criar e operar estruturas de dados nativas do Python (Listas, Tuplas e dicionários)
- como criar e usar funções em Python

Neste módulo, você aprenderá sobre como funciona a orientação a objetos em Python.

```python
class  FirstClass:
	def  helloWorld():
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
	def __init__(attr):
		# Contrutor em Python
		# método com o nome '__init__'
	
```

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
### Atributos

Classes podem possuir atributos. Atributos são variáveis que se encontram "dentro" do objeto ou da classe, dependendo desses para serem acessados. Existem dois tipos de atributo:
 - Dinâmicos ou de Objetos
 - Estáticos ou de Classe

Atributos Dinâmicos são os pertencem ao objeto. Cada objeto poderá ter valores diferentes para cada atributo dinâmico. Para ser acessado, deve ser vinculado a um objeto instanciado da Classe.

Atributos Estáticos são os que pertencem à Classe. São variaveis que se encontram dentro do contexto da Classe, mas se comportam como variáveis globais. Podem ser alteradas, mas sempre terá o mesmo valor independentemente de qual objeto a referencie.



##### Java
```Java
class Forma{                    // Criação da classe
	public String sabor;        // Criação do atributo 1
	public String cobertura;    // Criação do atributo 2

	// Definição do contrutor
	public Forma(String sabor, String cobertura){ 
		this.sabor = sabor;
		this.cobertura = cobertura;
	}

	public String cortar(){     // Criação do método 1
		return "Cortamos o bolo de " 
        		+ self.sabor;
	}

	public String comer(){      // Criação do método 2
		return "Comemos o bolo de " 
        		+ self.sabor;
	}
}
```

##### Python
```python
class Forma:                                # Criação da classe
	def __init__(self, sabor, cobertura):   # Definição do contrutor
		self.sabor = sabor                  # Criação do atributo 1
		self.cobertura = cobertura          # Criação do atributo 2

	def cortar(self):                       # Criação do método 1
		return ("Cortamos o bolo de " 
        		+ self.sabor)

	def comer(self):                        # Criação do método 2
		return ("Comemos o bolo de " 
        		+ self.sabor)
```

##### Java
```Java
```
##### Python
```python
```