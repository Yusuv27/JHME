package MHJAVAException.controller;

import MHJAVAException.createfile.CreateFile;
import MHJAVAException.data.User;
import MHJAVAException.view.View;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller2 {

    public static String controllDateOfBirth(String DateOfBirth){
        while(true) {
            String status = "ДАТА РОЖДЕНИЯ ВВЕДЕНО КОРРЕКТНО!";
            try {
                ArrayList dobList = new ArrayList(List.of(DateOfBirth.split("\\.")));
                if (dobList.size() != 3) {
                    throw new ArrayIndexOutOfBoundsException();
                }

                try {
                    if ((Integer.parseInt(dobList.get(0).toString()) > 31) || (Integer.parseInt(dobList.get(0).toString()) < 1)) {
                        status = "Некорректно введен день рождения!";
                    }
                } catch (NumberFormatException e) {
                    status = "НЕВЕРНЫЙ ФОРМАТ В ДНЕ РОЖДЕНИЯ!";
                }

                try {
                    if ((Integer.parseInt(dobList.get(1).toString()) > 12) || (Integer.parseInt(dobList.get(1).toString()) < 1)) {
                        status = "Некорректно введен месяц рождения!";
                    }
                } catch (NumberFormatException e) {
                    status = "НЕВЕРНЫЙ ФОРМАТ В МЕСЯЦЕ РОЖДЕНИЯ!";
                }

                try {
                    if ((Integer.parseInt(dobList.get(2).toString()) > 2023) || (Integer.parseInt(dobList.get(2).toString()) < 1900)) {
                        status = "Некорректно введен год рождения! Вам не может быть столько!";
                    }
                } catch (NumberFormatException e) {
                    status = "НЕВЕРНЫЙ ФОРМАТ В ГОДУ РОЖДЕНИЯ!";
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                status = "НЕВЕРНЫЙ ФОРМАТ ДАТЫ РОЖДЕНИЯ!";
            } catch (Exception e) {
                status = "НЕИЗВЕСТНАЯ ОШИБКА!";
            }
            if (status.equals("ДАТА РОЖДЕНИЯ ВВЕДЕНО КОРРЕКТНО!")) {
                System.out.println("\u001B[32m" + status + "\u001B[0m");
                break;
            } else {
                System.out.println("\u001B[31m" + status + "\u001B[0m");
                System.out.println("Введите дату рождения:\nПример: 01.12.2000");
                Scanner scanner = new Scanner(System.in);
                DateOfBirth = scanner.nextLine();
                status = "ДАТА РОЖДЕНИЯ ВВЕДЕНО КОРРЕКТНО!";
            }
        }
        return DateOfBirth;
    }
    public static String controllPhoneNumber(String PhoneNumber){
        while (true) {
            String status = "НОМЕР ТЕЛЕФОНА ВВЕДЕНО КОРРЕКТНО!";
            ArrayList arrayListNumber = new ArrayList(List.of(PhoneNumber.split("")));
            try {
                for (int i = 0; i < arrayListNumber.size(); i++) {
                    Integer.parseInt(arrayListNumber.get(i).toString());
                }
            } catch (NumberFormatException e) {
                status = "НЕВЕРНЫЙ ФОРМАТ НОМЕРА ТЕЛЕФОНА!";
            } catch (Exception e) {
                status = "НЕИЗВЕСТНАЯ ОШИБКА!";
            }

            if (status.equals("НОМЕР ТЕЛЕФОНА ВВЕДЕНО КОРРЕКТНО!")) {
                System.out.println("\u001B[32m" + status + "\u001B[0m");
                break;
            } else {
                System.out.println("\u001B[31m" + status + "\u001B[0m");
                System.out.println("Введите номер телефона:\nПример: 89777777777");
                Scanner scanner = new Scanner(System.in);
                PhoneNumber = scanner.nextLine();
                status = "НОМЕР ТЕЛЕФОНА ВВЕДЕНО КОРРЕКТНО!";
            }
        }
        return PhoneNumber;
    }
    public static String controllGender(String Gender){
        while (true) {
            String status = "ПОЛ ВВЕДЕН КОРРЕКТНО!";
            if ((Gender.equals("f")) || (Gender.equals("m"))) {

            } else {
                status = "ПОЛ ВВЕДЕН НЕКОРРЕКТНО!";
            }
            if (status.equals("ПОЛ ВВЕДЕН КОРРЕКТНО!")) {
                System.out.println("\u001B[32m" + status + "\u001B[0m");
                break;
            } else {
                System.out.println("\u001B[31m" + status + "\u001B[0m");
                System.out.println("Введите ваш пол(f-женский,m-мужской):\nПример: m");
                Scanner scanner = new Scanner(System.in);
                Gender = scanner.nextLine();
                status = "ПОЛ ВВЕДЕН НЕКОРРЕКТНО!";
                controllGender(Gender);
            }
        }
        return Gender;
    }


    public Controller2(String Surname,String Name,String MiddleName,String DateOfBirth,String PhoneNumber,String Gender)throws FileNotFoundException {
        DateOfBirth = controllDateOfBirth(DateOfBirth);
        PhoneNumber = controllPhoneNumber(PhoneNumber);
        Gender=controllGender(Gender);
        User user = new User(Surname,Name,MiddleName,DateOfBirth,PhoneNumber,Gender);
        CreateFile createFile = new CreateFile(user);
        View view = new View();
    }

}