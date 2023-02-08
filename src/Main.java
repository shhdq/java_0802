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

        Scanner scan = new Scanner(System.in);

        System.out.println("Ko Tu vēlies darīt?: (C = create, R = read, U = update, D = delete)");

        String usr_choice = scan.nextLine();



        switch (usr_choice) {
            case "C":
                System.out.print("Ievdi todo: ");
                String usr_todo = scan.nextLine();
                main.create(usr_todo);

                System.out.println("Tika izveidot jauns TODO!");
                break;
            case "R":
                main.read();
                break;
            case "U":
                System.out.print("Kuru todo vēlies mainīt?: ");
                int todo_index = scan.nextInt();

                System.out.print("Ievadi jauno todo: ");
                String todo_new = scan.nextLine();

                main.update(todo_index, todo_new);

                System.out.println("TODO tika izmainīts");

                break;

            case "D":
                System.out.print("Kuru TODO vēlies dzēst? ");
                int which_one = scan.nextInt();

                main.delete(which_one);

                System.out.println("TODO tika izdzēsts!");

                break;
        }


    }



}