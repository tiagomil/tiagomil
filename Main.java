public class Main {
    public static void main(String[] args) {
        Carro carro1 = CarroFactory.criarCarro("ESPORTIVO");
        carro1.dirigir();

        Carro carro2 = CarroFactory.criarCarro("SUV");
        carro2.dirigir();

        Carro carro3 = CarroFactory.criarCarro("SEDAN");
        carro3.dirigir();
    }
}
