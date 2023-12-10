package MHJAVAException.controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    public Controller()throws FileNotFoundException{
        Controller();
    }
    public static void Controller()throws FileNotFoundException {
        System.out.println("Введите ФИО дату рождения номер телефона пол(m-мужской,f-женский)\nСтрого через пробел!\nПример:Иванов Иван Иванович 01.02.2000 89777777777 m");
        try {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            ArrayList inputlist = new ArrayList(List.of(input.split(" ")));
            if (inputlist.size() < 6) {
                System.out.println("\u001B[31m"+"Введено меньше данных!"+"\u001B[0m");
            } else if (inputlist.size() > 6) {
                System.out.println("\u001B[31m"+"Введено больше данных!"+"\u001B[0m");
                throw new IndexOutOfBoundsException();
            } else {
                System.out.println("\u001B[32m"+"Введено верное количество данных!"+"\u001B[0m");}
            Controller2 controller2 = new Controller2(inputlist.get(0).toString(), inputlist.get(1).toString(), inputlist.get(2).toString(), inputlist.get(3).toString(), inputlist.get(4).toString(), inputlist.get(5).toString());
        }catch(IndexOutOfBoundsException e) {
            System.out.println("\u001B[31m"+"Введено неверное количество данных!"+"\u001B[0m");
            Controller();
        }
    }
}