package sem6;
import java.util.Scanner;


public class dzsem5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer number_1;
        Integer number_2;
        String a;
        char sum;

        System.out.print("Введите операцию:\n + Сумма \n - Разница \n * Произведение \n / Частное \n ");
        a = scan.next();
        sum = a.charAt(0);
        System.out.print("Введите первое число:");
        number_1 = scan.nextInt();
        System.out.print("Введите второе число:");
        number_2 = scan.nextInt();
        
        if (sum == '+') {
            operation.otvet(number_1, number_2,sum);
            // answer = number_1 + number_2;
            System.out.println();
        } else if (sum == '-') {
            Minus.otvet(number_1, number_2,sum);
        } else if (sum == '*') {
            multi.otvet(number_1, number_2,sum);
        } else if (sum == '/') {
            delitel.otvet(number_1, number_2,sum);
        } else {
            System.out.println("Неверная операция!");
        }    
        scan.close();
    }
}