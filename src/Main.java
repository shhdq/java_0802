import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<String> todos = new ArrayList<>();

    // crud

    // create - c
    public void create(String todo) {
        todos.add(todo);
    }

    // read - r
    public void read() {
        for (String todo : todos) {
            System.out.println(todo);
        }
    }

    // update - u
    public void update(int index, String newTodo) {
        todos.set(index, newTodo);
    }

    // delete - d
    public void delete(int index) {
        todos.remove(index);
    }


    public static void main(String[] args) {

        Main main = new Main();

        main.create("Pabarot kaķi");
        main.create("Skriet 10km");

        main.update(0, "Pabarot suni");

        main.delete(1);

        main.read();


    }



}