public class Carro extends Veiculo {    
    @Override
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado!");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustível.");
    }

    private void confereCambio() {
        System.out.println("Conferindo ponto P do Câmbio.");
    }
}
