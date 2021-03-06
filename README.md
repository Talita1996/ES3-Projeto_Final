# Silence is gold ![Silence](/assets/silencioso.png)
# Treinamento da Linguagem Python para Programadores

Este curso tem como foco ensinar como programar em python para pessoas que já possuem experiência em outras linguagens de programação. Se esse não é o seu caso, você pode ainda aprender um pouco, mas poderá ter uma lacuna conceitual.

### Introdução

Ao contrario do que parece, o que deu o nome à linguagem Python não foi as cobras, por mais que a ideia tenha pegado de tal forma que se tornou o logo da linguagem. O nome foi inspirado no grupo de comédia britânico "Monte Python".

Você que ja conhece alguma outra linguagem, que já domina os conceitos de lógica de programação e é capaz de desenvolver um código que solucione um problema apresentado, certamente ja criou algumas práticas próprias, algumas formas de fazer, formas de pensar, normais da linguagem que você aprendeu. Para linguagem python, a forma de fazer as coisas também é muito importante.

Na verdade, a linguagem python contruiu uma comunidade vasta de programadores, pesquisadores, engenheiros, dentre várias outras áreas, que conseguem enxergar no python não apenas uma linguagem de programação mas uma forma de pensar, ou até uma filosofia de vida. O próprio python cria e incentiva essa ideia desde a sua criação, quando um dos criadores da linguagem, o Tim Peters escreveu o texto "The Zen of Python". Este se tornou a filosofia dos desenvolvedores e usuarios da linguagem que esse texto foi incluido no interpretador, para acessá-lo, basta escrever o comando:

```python
import this
```
> The Zen of Python, by Tim Peters<br>
> <br>
> Beautiful is better than ugly.<br>
> Explicit is better than implicit.<br>
> Simple is better than complex.<br>
> Complex is better than complicated.<br>
> Flat is better than nested.<br>
> Sparse is better than dense.<br>
> Readability counts.<br>
> Special cases aren't special enough to break the rules.<br>
> Although practicality beats purity.<br>
> Errors should never pass silently.<br>
> Unless explicitly silenced.<br>
> In the face of ambiguity, refuse the temptation to guess.<br>
> There should be one-- and preferably only one --obvious way to do it.<br>
> Although that way may not be obvious at first unless you're Dutch.<br>
> Now is better than never.<br>
> Although never is often better than *right* now.<br>
> If the implementation is hard to explain, it's a bad idea.<br>
> If the implementation is easy to explain, it may be a good idea.<br>
> Namespaces are one honking great idea -- let's do more of those!<br>

Não é atoa que esse texto é chamado de zen. Mesmo os que não conhecem esse texto, acabam sendo levados a programar da forma que ele propoe pois a própria linguagem provê isso. E para os mais experientes, sempre buscam a "forma pythoniana" de fazer as coisas. 

De fato, como em qualquer linguagem, é possivel fazer barbeiragens, gambiarras, mutretas ou como você quiser chamar, mas muitas que outras linguagens permitem, o interpretador do python identifica e não deixa passar.

Você que está aprendendo agora a linguagem, lembre-se, se o seu código esta ficando com uma aparencia dificil, beirando a ilegibilidade, muito provavel que exista uma forma pythoniana que você não conhece ou não está usando.

### Primeiros passos

Python é uma linguagem interpretada. Existem várias formas de se acessar e usar o interpretador python. A forma clássica é através da instalação do [interpretador padrão do python](https://www.python.org/downloads/) encontrada no [site da linguagem](https://www.python.org/downloads/)

Nesse link você encontrará a forma de fazer o download de acordo com o seu sistema operacional. Após a instalação, você poderá acessar o python pelo terminal Python. Acesse o seu menu iniciar e digite:
> Python

Você encontrará o python na versão que você tiver instalado. Ao clicar nele, você receberá uma tela de terminal com alguns nomes escritos. No python instalado no momento em que e este curso foi escrito, o resultado foi:
```sh
Python 3.9.6 (tags/v3.9.6:db3ff76, Jun 28 2021, 15:26:21) [MSC v.1929 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license" for more information.
>>>
```

Neste momento, qualquer comando digitado é lido e interpretado pelo interpretador python.

Uma outra forma de acessar e executar códigos python é atraves de scripts. Você pode criar um arquivo em algum local no seu computador, com a extensão '.py'.

> ./nome_do_arquivo.py
```python
print("Hello World!")
```

Agora execute no terminal do seu sistema operacional. Para isso, basta acessar o terminal do seu SO, na pasta onde se encontra o aquivo com a extensão .py que você criou, e digitar:

```sh
>python nome_do_arquivo.py
```

### Notebook Python - Google Colab

Uma forma alternativa de executar comandos python é criando um notebook python. Esse é um arquivo que pode conter mais de um script python, além de seções de texto em Markdown. Com isso, fica fácil criar projetos com todas as execuções e explicações em um só local. Também permite explicar um assunto e propor exercicios, que por sinal é o que faremos neste treinamento.

Você pode usar arquivos de notebook python na ferramenta [Google Colab](https://colab.research.google.com/). Essa ferramenta carrega o mesmo principio das outras ferramentas online da Google, como o docs, slides, sheets entre outros.

Lá você poderá criar e editar seus próprios arquivos notebook. Caso você goste da ferramenta e deseje criar os seus próprios arquivos, pode seguir um tutorial para esse fim, como o tutorial da [Kenzie](https://kenzie.com.br/blog/google-colab/), ou qualquer outro que você achar na internet, por mais que desde já possa te dizer que rapidamente você aprenderá, mesmo sozinho, mexendo um pouco na ferramenta.

Neste curso te ensinaremos apenas a importar os notebooks criados para os exercicios do curso, e usá-los. Para isso, você deve acessar o [Google Colab](https://colab.research.google.com/).

![Boas Vindas](/assets/colab-boas-vindas.PNG)

Quando você acessar o colab pela primeira vez, você verá essa tela. Caso você não veja essa tela, clique na aba *Arquivo*, e depois em *Abrir notebook*, ou use o atalho *Ctrl+O*

![Abrir](/assets/colab-arquivo-abrir.PNG)

Quando você estiver na tela de abrir um notebook, você verá uma aba com o nome GitHub. Nela você colocará um link de um repositório que contenha arquivos Notebook Python. No caso, para você acessar os notebooks com os exercicios deste curso, você colocará o link:
> https://github.com/Talita1996/ES3-Projeto_Final/

Em seguida, clique na lupa ao lado do campo do link para encontrar o repositório.

![Importe Github](/assets/colab-github.PNG)

Você receberá uma lista dos arquivos notebook inclusos neste curso. Selecione o arquivo referente ao capítulo que você deseja exercitar, ou o solucionário das questões do respectivo capítulo.

Com o notebook aberto, em cada célula de texto, apenas serão vistos os titulos e as demais estruturas virtuais do arquivo markdown. Para editar, basta clicar duas vezes sobre a célula para realizar a edição. Para sair do modo de edição, basta clicar fora da célula.

![colab-celula](/assets/colab-celula.PNG)

No caso das células python, essas podem ser editadas e executadas. Para editar basta clicar sobre a área da célula e escrever seu código python. Para executar, ao passar o mouse sobre a célula, do lado esquerdo,  você verá um botão com o ícone de Play. Ao clicar nesse botão, a célula será executada e a saída será apresentada em baixo da célula.

### Estrutura do curso

O curso é dividido em quatro módulos:
1. Variáveis e Tipos
2. Estruturas de Dados
3. Loops, Condicionais e Funções
4. Orientação à Objetos

Em cada módulo, estarão disponiveis, além da explicação, alguns exercicios que você poderá fazer e testar para avaliar os seus conhecimentos.