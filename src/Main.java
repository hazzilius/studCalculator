import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();
        int result;
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
                //TODO min
                System.out.println("Операция вычитания");
                break;
            case 3:
                //TODO div
                System.out.println("Операция деления");
                break;
            case 4:
                //TODO mul
                System.out.println("Операция умножения");
                break;
            default:
                System.out.print("Неправильный номер операции!");
                break;
        }
    }

    static int Sum(int num1, int num2){
        return num1 + num2;
    }
}