public class Main {
    public static void main(String[] args) {
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

    public static void task1() {
        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        for (byte i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task5() {
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <=12; i = i + 1) {
            total = salary + total;
            System.out.println( "зарплата за месяц  " + salary+ " руб. Сумма накоплений равна " +total+ " руб.");}}
    public static void task9() {
        int salary = 29000;
        int total = 0;
        for (int i =0; i<12;  i = i + 1){
            total=total+total/100;
            total=total+salary;
            System.out.println("зарплата за месяц  " + salary+ " руб. Сумма накоплений, с учётом процентов по вкладу равна " +total+ " руб.");}
    }
    public static void task10() {
        int number = 2;
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println(number*i);}}}

