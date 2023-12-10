package MHJAVAException.createfile;

import MHJAVAException.view.View;

import java.io.*;
import java.util.Scanner;

public class ReadintFile {
    public ReadintFile() throws FileNotFoundException {
        System.out.println("Напишите название файла который хотите просмотреть(Фамилию):");
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.nextLine();
        try{
            File myFile = new File(surname);
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line;
            System.out.println("Просмотр файла "+surname+": ");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {//Если хотим прекращение работы:
            System.out.println("\u001B[31m"+"Такого файла нет"+"\u001B[0m");// То убираем это
//            throw new FileNotFoundException("Нет файла");//и убираем //перед throw new FileNotFoundException("Нет файла");
        } catch (IOException ex) {
            throw new RuntimeException();
        }
        View view = new View();
    }
}
