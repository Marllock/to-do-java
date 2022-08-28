import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<String> task = new ArrayList<String>();

        while (option != 4) {
            System.out.println("1- Adicionar tarefa  // 2- Listar tarefas // 3- remover tarefa  // 4- Sair");
            option = input.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Digite o nome da tarefa:");
                    input.nextLine();
                    task.add(input.nextLine());
                }
                case 2 ->{
                    for (String count : task) {
                        System.out.println("Tarefa: " + count);
                    }
                }
                case 3 -> {
                    System.out.println("\nDigite o nome da tarefa para remover: ");
                    input.nextLine();
                    task.remove(input.nextLine());
                }
                case 4 -> {
                    System.out.println("Sair");
                }
            }
        }
    }
}
