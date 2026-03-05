import java.util.Scanner;

public class ChoosingAnAction {
    private static void Menu(){
        System.out.println("МЕНЮ ДЕЙСТВИЙ");
        System.out.println("Введите цифру того действия которое хотите выполнить");
        System.out.println("1 - Вывести список ваших заметок");
        System.out.println("2 - Написать новую заметку");
        System.out.println("3 - Выход");
    }
    public void choosing() {
        FileRP file = new FileRP();
        Scanner sc = new Scanner(System.in);
        while (true) {
            Menu();
            int num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 1:
                    file.Read();
                    break;
                case 2:
                    System.out.println("Когда закончите писать заметку просто напишите 'end' или 'конец'.");
                    file.Print();
                    break;
                case 3: {
                    System.out.println("Закрытие заметок...");
                    sc.close();
                    return;
                }
            }

        }
    }}
