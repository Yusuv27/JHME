package MHJAVAException.view;

import MHJAVAException.controller.Controller;
import MHJAVAException.createfile.ReadintFile;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class View {
    public View()throws FileNotFoundException{
        View();
    }
    public void CreateFile()throws FileNotFoundException{
        Controller controller = new Controller();
    }
    public void ReadintFile() throws FileNotFoundException {
        ReadintFile readintFile = new ReadintFile();
    }
    public void View()throws FileNotFoundException{
        try{ //А так же убираем это
            System.out.println("Какую функцию выбираете?\n1.Создать данные\n2.Прочесть данные\n3.Завершить работу");
            Scanner scanner = new Scanner(System.in);
            String menu = scanner.nextLine();
            if (menu.equals("1")){
                CreateFile();
            } else if (menu.equals("2")) {
                ReadintFile();
            } else if (menu.equals("3")) {
                System.out.println("До свидания!");
            }else{
                System.out.println("\u001B[31m"+"Неверно введена функция!"+"\u001B[0m");
                View();
            }//Для того чтобы приложение прекращало аварийно работу:
        }catch (Exception e){//Убираем это
            System.out.println("\u001B[31m"+"Возникновение ошибки!"+"\u001B[0m");//Убираем это
            View();//Убираем это
        }//Убираем это
    }
}
