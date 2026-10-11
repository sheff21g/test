package HomeWork;

public class Calculator {
    static void main() {
        int x = 25;
        int y = 15;
        int sum = x + y;
        int sub = x - y;
        int mul = x * y;
        double div = (double) x / y;
        int modulo = sum % 2;
        System.out.println("Сумму чисел:" + sum);
        System.out.println("Разность чисел:" + sub);
        System.out.println("Произведение чисел:" + mul);
        System.out.println("Частное (деление):" + div);
        System.out.println("Остаток от деления:" + modulo);

    }
}
