//Вывести все простые числа от 1 до 1000
public class task2 {
    public static void main(String[] args) {
        //Вывести все простые числа от 1 до 1000
        int n = 1000;
        for (int i = 2; i < n; i++) {
            if (equals(i) == true) {
                System.out.printf("%d ", i);
            }
        }
        //System.out.println(equals(11));
    }
    private static boolean equals(int n) {
        for (int i = 2; i < n-1; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
