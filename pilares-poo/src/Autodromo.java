public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("3369");
        jeep.ligar();
        
        Moto z400 = new Moto();
        z400.setChassi("8080");
        z400.ligar();
    }
}
