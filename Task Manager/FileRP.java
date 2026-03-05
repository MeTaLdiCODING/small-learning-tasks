import java.io.*;
import java.util.Scanner;

public class FileRP {
    public void Print() {
    File file = new File("C:\\Users\\Admin\\Desktop\\Back\\Tasks\\Tasks");
    try ( PrintStream out = new PrintStream(new FileOutputStream(file, true));){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String output = sc.nextLine();
            if (output.equalsIgnoreCase("end")){out.println("----------НОВАЯ ЗАМЕТКА---------------");break;}
            if (output.equalsIgnoreCase("конец")){out.println("----------НОВАЯ ЗАМЕТКА---------------");break;}
            out.println(output);
        }
    }catch (IOException e){
        System.out.println("Ошибка при работе с файлом"+ e.getMessage());

    }
}
public void Read() {
 File file = new File("C:\\Users\\Admin\\Desktop\\Back\\Tasks\\Tasks");
 try( Scanner sc = new Scanner(file);) {
     while (sc.hasNextLine()){
         System.out.println(sc.nextLine());
     }
 }catch (FileNotFoundException e){
     System.out.println("Файл для чтения не найдет"+ e.getMessage());
 }
}
}
