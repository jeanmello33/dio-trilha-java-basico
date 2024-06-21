iPhone Project

Este projeto implementa as funcionalidades básicas de um iPhone, incluindo um reprodutor musical, aparelho telefônico e navegador na internet. O objetivo é demonstrar a utilização de interfaces e classes em Java, aplicando conceitos de Polimorfismo e Abstração.

Estrutura do Projeto

src/: Contém os arquivos de código fonte Java.

ReprodutorMusical.java: Interface que define os métodos relacionados à reprodução musical.

AparelhoTelefonico.java: Interface que define os métodos 
relacionados ao aparelho telefônico.

NavegadorInternet.java: Interface que define os métodos relacionados ao navegador de internet.

iPhone.java: Classe que implementa as interfaces 

ReprodutorMusical, AparelhoTelefonico e NavegadorInternet.

Main.java: Classe principal que contém o método main para executar o programa.

diagrams/: Contém o diagrama UML do projeto.

iPhone_UML.png: Diagrama UML que ilustra a estrutura das classes e interfaces do projeto.

README.md: Arquivo que você está lendo, contendo a descrição do projeto e instruções.

Diagrama UML

O diagrama UML (diagrams/iPhone_UML.png) descreve a estrutura do projeto, incluindo as interfaces e a classe que as implementa. 

Ele ajuda a visualizar a organização do código e as relações entre os componentes.


Executar o Projeto

Para compilar e executar o projeto, siga os passos abaixo:

Navegue até a pasta src:

cd src

Compile os arquivos Java:

javac *.java

Execute a classe principal:

java Main

Funcionalidades

Reprodutor Musical

A interface ReprodutorMusical define os seguintes métodos:

tocar(): Método para iniciar a reprodução da música.

pausar(): Método para pausar a reprodução da música.

selecionarMusica(String musica): Método para selecionar a música a ser reproduzida.

Aparelho Telefônico

A interface AparelhoTelefonico define os seguintes métodos:

ligar(String numero): Método para realizar uma ligação para o número especificado.

atender(): Método para atender uma chamada.

iniciarCorreioVoz(): Método para iniciar o correio de voz.

Navegador na Internet

A interface NavegadorInternet define os seguintes métodos:

exibirPagina(String url): Método para exibir uma página web com o URL especificado.

adicionarNovaAba(): Método para adicionar uma nova aba no navegador.

atualizarPagina(): Método para atualizar a página atual.

Classe iPhone

A classe iPhone implementa todas as interfaces acima e fornece as implementações específicas para os métodos.

Classe Main

A classe Main contém o método main que demonstra o uso das funcionalidades do iPhone:

public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();
        
        // Testando o Reprodutor Musical
        meuIPhone.selecionarMusica("Minha Música Favorita");
        meuIPhone.tocar();
        meuIPhone.pausar();
        
        // Testando o Aparelho Telefônico
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        // Testando o Navegador na Internet
        meuIPhone.exibirPagina("https://www.exemplo.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}

Sobre

Este projeto foi desenvolvido para demonstrar a aplicação de conceitos de Orientação a Objetos em Java, especificamente a implementação de múltiplas interfaces por uma única classe. O iPhone simulado aqui serve como um exemplo para ilustrar como diferentes funcionalidades podem ser encapsuladas e organizadas usando interfaces e classes em Java.