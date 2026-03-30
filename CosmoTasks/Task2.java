
/**
 * Напишите программу,
 * которая на вход получает строку “Мама мыла Милу мылом!” и выводит количество слов в ней.
 * “Мама мыла Милу мылом!” -> 4
 * <p>
 * Подсказка: используйте метод .split() класса String
 */
public class Task2 {
  public static void main(String[] args) {
    String input = "Мама мыла Милу мылом!";
String[] result =input.split(" ") ;
System.out.println(result.length);
  }
}
