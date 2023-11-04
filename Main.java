import Model.Pets;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Pets> petsArrayList = new ArrayList<>();
        String answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует программа учета животных");
        while (true){
            MenuPrint();
            answer = scanner.nextLine();
            Menu(answer);
        }
    }

    private static void Menu(String answer) {
        switch (answer){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                System.exit(0);
            default:
                System.out.println("Комманда не распознана");
        }
    }

    private static void MenuPrint() {
        System.out.println("Пожалуйста выберите действие");
        System.out.println("1.Добавить животное");
        System.out.println("2.Показать информацию о командах");
        System.out.println("3.Добавить команду");
        System.out.println("4.Выход");
    }


    private static void AddPet(){
        String name;
        String type;
        Date BirthDate;
        String command;
    }

}
