import Model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Pets> petsArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Вас приветствует программа учета животных");
        while (true){
            MenuPrint();
            Menu(scanner.nextLine());
        }
    }

    private static void Menu(String answer) {
        switch (answer) {
            case "1" -> AddPet();
            case "2" -> ShowCommand();
            case "3" -> AddCommand();
            case "4" -> System.exit(0);
            default -> System.out.println("Комманда не распознана");
        }
    }

    private static void MenuPrint() {
        System.out.println("Пожалуйста выберите действие");
        System.out.println("1.Добавить животное");
        System.out.println("2.Показать информацию о командах");
        System.out.println("3.Добавить команду");
        System.out.println("4.Выход");
    }


    private static void ShowCommand(){
        int i = ChosePet();
        System.out.println("Список комманд для " + petsArrayList.get(i).getName()+" :");
        System.out.println(petsArrayList.get(i).getCommands());
    }

    private static void AddCommand(){
        int i = ChosePet();
        System.out.println("Какие комманды вы ходите добавить для " +petsArrayList.get(i).getName()+":");
        petsArrayList.get(i).setCommands(petsArrayList.get(i).getCommands()+scanner.nextLine());
    }

    private static int ChosePet(){
        int i = 0;
        System.out.println("Выберите номер животного");
        for (Pets pet:
             petsArrayList) {
            System.out.println(i+1+" "+pet.getName());
            i++;
        }
        return scanner.nextInt()-1;
    }

    private static void AddPet(){
        String name;
        PetType type = null;
        String BirthDate;
        String command;
        System.out.println("Пожалуйста введите имя животного");
        name = scanner.nextLine();
        while (type == null){
            System.out.println("Пожалуйста выберите тип животного");
            System.out.println("1.Кот");
            System.out.println("2.Собака");
            System.out.println("3.Хомяк");
            System.out.println("4.Верблюд");
            System.out.println("5.Лошадь");
            System.out.println("6.Осел");
            switch (scanner.nextLine()) {
                case "1" -> type = PetType.Cat;
                case "2" -> type = PetType.Dog;
                case "3" -> type = PetType.Hamster;
                case "4" -> type = PetType.Camel;
                case "5" -> type = PetType.Horse;
                case "6" -> type = PetType.Donkey;
            }
        }
        System.out.println("Введите дату рождения");
        BirthDate = scanner.nextLine();
        System.out.println("Введите команды");
        command = scanner.nextLine();
        System.out.println("Имя животного: " + name);
        System.out.println("Вид животного: " + type);
        System.out.println("Дата рождения: " + BirthDate);
        System.out.println("Комманды: " + command);
        System.out.println("Все верно?(Y/N)");
        if(!scanner.nextLine().equalsIgnoreCase("y")){
            return;
        }
        switch (type) {
            case Cat -> petsArrayList.add(new Cat(name,BirthDate,command));
            case Dog -> petsArrayList.add(new Dog(name,BirthDate,command));
            case Hamster -> petsArrayList.add(new Hamster(name,BirthDate,command));
            case Horse -> petsArrayList.add(new Horse(name,BirthDate,command));
            case Camel -> petsArrayList.add(new Camel(name,BirthDate,command));
            case Donkey -> petsArrayList.add(new Donkey(name,BirthDate,command));
        }

    }

}
