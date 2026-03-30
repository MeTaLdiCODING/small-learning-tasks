import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
convert(takeInitial(),takeExchange(),getAmount());
    }
    static String takeInitial(){
        System.out.println("Выберете валюту которую хотите конвертировать: ");
        System.out.println("RUB");
        System.out.println("USD");
        System.out.println("EUR");
        Scanner initialMoney = new Scanner(System.in);
        return initialMoney. next().toUpperCase();
    }
    static String takeExchange(){
        System.out.println("Выберете на какую валюту вы хотите конвертировать: ");
        System.out.println("RUB");
        System.out.println("USD");
        System.out.println("EUR");
        Scanner ExchangeMoney = new Scanner(System.in);
        return ExchangeMoney.next().toUpperCase();
    }
    static double getAmount(){
        System.out.println("Введите сумму которую вы хотите конвертировать: ");
        Scanner amountMoney = new Scanner(System.in);
        return amountMoney.nextDouble();
    }
    static void convert(String takeInitial, String takeExchange, double getAmount){
        double RUB_to_USD=0.012654;
        double RUB_to_EUR=0.011042;
        double USD_to_RUB= 79.02;
        double USD_to_EUR=0.8685;
        double EUR_to_USD=1.15;
        double EUR_to_RUB=90.56;
if(takeInitial.equals("RUB")){
    if(takeExchange.equals("USD")){
    System.out.println("Ваша сумма в USD: " + getAmount* RUB_to_USD);
    }
    else if(takeExchange.equals("EUR")){
    System.out.println("Ваша сумма в EUR: "+getAmount* RUB_to_EUR);
    }
    else{
        System.out.println("Введено некоректное значение!");
    }
}
        if(takeInitial.equals("USD")){
            if(takeExchange.equals("RUB")){
                System.out.println("Ваша сумма в RUB: " + getAmount* USD_to_RUB);
            }
            else if(takeExchange.equals("EUR")){
                System.out.println("Ваша сумма в EUR: "+getAmount* USD_to_EUR);
            }
            else{
                System.out.println("Введено некоректное значение!");
            }
        }
        if(takeInitial.equals("EUR")){
            if(takeExchange.equals("USD")){
                System.out.println("Ваша сумма в USD: " + getAmount* EUR_to_USD);
            }
            else if(takeExchange.equals("RUB")){
                System.out.println("Ваша сумма в RUB: "+getAmount* EUR_to_RUB);
            }
            else{
                System.out.println("Введено некоректное значение!");
            }
        }
    }
}
