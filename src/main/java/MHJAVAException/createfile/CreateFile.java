package MHJAVAException.createfile;

import MHJAVAException.data.User;

import java.io.*;

public class CreateFile {
    public CreateFile(User user){
        File MyFile= new File(user.getSurname());
        try (PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(MyFile,true)))) {
            write.println("<"+user.getSurname()+"><"+user.getName()+"><"+user.getMiddleName()+"><"+user.getDateOfBirth()+"><"+user.getPhoneNumber()+"><"+user.getGender()+">");
        } catch (IOException e) {
            System.out.println("Ошибка!");
        }
    }
}
