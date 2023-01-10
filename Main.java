public class Main {
    public static void main(String[] args) {
        test();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void test() {
        System.out.println("Тестовые задачи");
        for (int a = 0; a < 10; a = a + 1){
            System.out.println("Итеарция цикла " + a);
        }
        for (int s = 2020; s < 2077; s = s + 4) {
            System.out.println("Високосный год " + s);
        }
        int salary = 65535;
        int total = 0;
        for (int d = 0; d < 12; d++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + d + " Итого " + total);
        } System.out.println(total);
    }
    public static void task1() {
        System.out.println("Задание 1");
        for (int w = 1; w <= 10; w = w + 1) {
            System.out.println(w);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        for (int q = 10; q >=0; q = q - 1) {
            System.out.println(q);
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        for (int e = 0; e <= 17; e = e + 2) {
            System.out.println(e);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        for (int r = 10; r >=-10; r = r - 1) {
            System.out.println(r);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        for (int t = 1904; t < 2096; t = t +4) {
            System.out.println("Високосный год " + t);
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        for (int y = 7; y <100; y = y + 7) {
            System.out.println(y);
        }
    }
    public  static void  task7() {
        System.out.println("Задача 7");
        for (int u = 1; u < 700; u = u * 2) {
            System.out.println(u);
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int money = 29000;
        int moneyInvest = 0;
        for (int mount = 0; mount < 12; mount++) {
            moneyInvest = moneyInvest + money;
            System.out.println("Месяц " + mount + ", сумма накоплений равна " + moneyInvest + " рублей.");
        }
    }
    public static void task9() {
        System.out.println("Задача 9");
        int money1 = 29000;
        int moneyInvest1 = 0;
        for (int mount1 = 0; mount1 < 12; mount1++) {
            moneyInvest1 = moneyInvest1 / 100 + moneyInvest1;
            moneyInvest1 = moneyInvest1 + money1;
            System.out.println("Месяц " + mount1 + ", сумма накоплений равна " + moneyInvest1 + " рублей.");
        }
    }
    public static void task10() {
        System.out.println("Задача 10");
        for (int table = 1; table <= 10; table++) {
            int number2 = table * 2;
            System.out.println("2 * " + table + " = " + number2);
        }
    }
}