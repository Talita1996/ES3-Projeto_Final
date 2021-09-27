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

É importante você saber que todos os identificadores em Python são considerados objetos (Variáveis, Funções, Classes). Sendo assim, possuem métodos, atributos, são instanciados de acordo com a sua classe assim como qualquer linguagem Orientada a Objetos. Se você ainda não conhece sobre orientação a objetos, ou ainda não tem dominio sobre o assunto, mais adiante serão apresentados esses conceitos.

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
Para demonstrar o funcionamento da orientação a objeto, serão apresentados os conceitos e uma comparação com a linguagem Java, por ser um exemplo comum de Orientação a objetos.

**Objetos** nada mais são do que Instancias de uma Classe. **Classes** são a base, ou o molde, de como serão os objetos que serão feitos dela. **Instancias** são como se fossem _unidades_ de um tipo, ou uma classe. Cada unidade possui _caracteristicas próprias_, ou **Atributos**,  mas sempre terá _comportamentos_, ou **Métodos**,  iguais às outras _unidades_ do mesmo tipo, ou seja, sempre terá **Métodos** iguais aos outros **Objetos** da mesma **Classe**.

Para entender melhor esse conceito, podemos usar uma metáfora. Os **objetos** são como _bolos_, feitos em uma _forma_ que seria a representação de uma **Classe**. Sempre, os _bolos_ feitos em uma _forma_ apresentarão o mesmo formato. Todos também sempre serão cortados e comidos do mesmo jeito, mas poderão ter sabores, textura de massa, cobertura diferentes. Os sabores são definidos pelos ingredientes que são batidos juntos em uma batedeira e postos sempre do mesmo jeito.

<!-- Imagem do bolo e da forma -->

Trazendo da metáfora (antes que você fique com fome), como dito, a _forma_ é como se fosse a **Classe**, e _cada bolo_ feito nessa forma é como um **Objeto** dessa Classe, ou uma **Instância** dessa Classe. 

O jeito de cortar, ou o jeito de comer, são os _Comportamentos_ dos bolos que são feitos nessa forma. Assim como, cada objeto feito de uma Classe possuirá **métodos** definidos pela Classe. Os métodos são funções específicas de uma classe de objetos. Mais adiante serão explicados os tipos diferentes de métodos, e como eles funcionam.

Sabores, textura de massa, cobertura, são _caracteristicas_ que não são definidas pela forma, e sim pelos ingredientes que são postos nela. Sendo assim, cada bolo poderá ter essas casacterísticas diferentes. Objetos possuem **Atributos**, e esses, do mesmo jeito que o sabor do bolo, são independentes em relação aos outros objetos. Atributos são definidos no objeto como variáveis que são parte do objeto. É como se estivessem, metaforicamente, "dentro" do objeto.

O bolo é feito ao bater os ingredientes numa batedeira, passada a massa para forma e posto para assar. Esse processo no bolo é chamado de fazer o bolo, mas em Orientação a Objetos é conhecido como Construir o bolo, ou qualquer objeto. Para construir um objeto, é chamado o construtor desse classe. Nele são especificados como os ingredientes deverão ser misturados para construir o novo objeto. Ao final, o objeto, a instancia, ou o bolo, é devolvido como resultado.

Em linguagens de programação, para trabalhar com objetos, do mesmo jeito que com bolos, a primeira coisa a ser feita é a forma. A baixo, segue o código para a criação de uma Classe em Python, do lado esquerdo, e em Java, do lado direito.
<table border="0">
 <tr>
    <td><b style="font-size:30px">Python</b></td>
    <td><b style="font-size:30px">Java</b></td>
 </tr>
 <tr>
    <td>

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
	</td>
    <td>
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
	</td>
 </tr>
</table>

Observe que ao definir a classe, são definidos os métodos, os atributos e nesse caso também o construtor. Para efeito de comparação, o mesmo código será 