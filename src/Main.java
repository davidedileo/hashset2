import java.util.HashSet;

//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato

public class Main {
    public static void main(String[] args) {

        HashSet<String> fruitSet = riempiFruitSet();
        String fruitcheck = "Papaya";
        fruitSet.add(fruitcheck);
        boolean verificaPresenza = fruitSet.contains(fruitcheck);

        System.out.println("L'oggetto " + fruitcheck + " é presente nel set? " + verificaPresenza);

    }

    private static HashSet<String> riempiFruitSet() {
        HashSet<String> fruitSet = new HashSet<>();

        fruitSet.add("Mela");
        fruitSet.add("Arancia");
        fruitSet.add("Banana");
        fruitSet.add("Mango");
        return fruitSet;
    }

}