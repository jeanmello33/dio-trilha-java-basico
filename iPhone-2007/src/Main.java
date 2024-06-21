// src/Main.java
public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 13", "15.0");

        // Teste do Reprodutor Musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Não Tive Medo - Jean Mello");

        // Teste do Aparelho Telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste do Navegador na Internet
        meuIphone.exibirPagina("https://www.dreamusic.shop");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
