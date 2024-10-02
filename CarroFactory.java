public class CarroFactory {
    public static Carro criarCarro(String tipo) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("ESPORTIVO")) {
            return new CarroEsportivo();
        } else if (tipo.equalsIgnoreCase("SUV")) {
            return new CarroSUV();
        } else if (tipo.equalsIgnoreCase("SEDAN")) {
            return new CarroSedan();
        }
        return null;
        }
}
