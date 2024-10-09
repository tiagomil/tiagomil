import java.util.List;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Nissan();

        Carro carro2 = new Toyota();

        Carro carro3 = new Honda();

        List<Carro> carros = List.of(carro1, carro2, carro3);
        printList(carros);

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        printList(integerList);

        List<String> stringList = List.of("Apple", "Banana", "Orange");
        printList(stringList);

    }

    public static <T> void printList(List<T> list) {
        for (T item : list){
            System.out.println(item);
        }
    }

}