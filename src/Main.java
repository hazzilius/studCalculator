import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scan.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scan.nextDouble();
        System.out.print("""
                1) +
                2) -
                3) /
                4) *
                """);
        System.out.print("Выберите номер операции: ");
        int option = scan.nextInt();
        switch (option){
            case 1:
                System.out.println("\n" + num1 + " + " + num2 + " = " + Sum(num1, num2));
                break;
            case 2:
                System.out.println("\n" + num1 + " - " + num2 + " = " + Min(num1, num2));
                break;
            case 3:
                System.out.println("\n" + num1 + " / " + num2 + " = " + Div(num1, num2));
                break;
            case 4:
                System.out.println("\n" + num1 + " * " + num2 + " = " + Mul(num1, num2));
                break;
            default:
                System.out.print("Неправильный номер операции!");
                break;
        }
    }

    static double Sum(double num1, double num2){
        return num1 + num2;
    }

    static double Min(double num1, double num2){
        return num1 - num2;
    }

    static double Div(double num1, double num2){
        return num1 / num2;
    }

    static double Mul(double num1, double num2){
        return num1 * num2;
    }
}