//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
//Ввод:5
//Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//n! 1 * 2 * 3 * 4 * 5 = 120
public class task1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.printf("Факториал %d = %d", n, fact(n));
        System.out.println();
        System.out.printf("Треугольное число числа %d = %d", n, trig(n));
    }

    public static int fact(int n) {
        if (n <= 1) return 1;
        else return fact(n - 1) * n;
    }
    public static int trig(int n) {
        if (n == 1) return 1;
        else if (n == 0) {
            return 0;
        }
        else return trig(n-1) + n;
    }
}
