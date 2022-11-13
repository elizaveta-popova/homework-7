public class Main {
    public static void main(String[] args) {
        //Дз 1, Задача 1
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int month = 1;
        while (total < 2459000) {
            month++;
            total = total + total/100;
            total = total + deposit;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
        //Дз 1, Задача 2
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for (int i2 = 10; i2 > 0; i2--) {
            System.out.print(i2 + " ");
        }
        //Дз 1, Задача 3
        System.out.println("\n");
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthPerYear = population / 1000 * 17;
        int mortalityPerYear = population / 1000 * 8;
        for (int year = 0; year <= 10; year++) {
            population = population + birthPerYear - mortalityPerYear;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        //Дз 2, Задача 1
        System.out.println("Задача 1");
        int deposit1 = 15000;
        int total1 = 0;
        int month1 = 1;
        while (total1 < 12_000_000) {
            month1++;
            total1 = total1 + total1 * 7 / 100;
            total1 = total1 + deposit1;
            System.out.println("Месяц " + month1 + " сумма накоплений равна " + total1 + " рублей");
        }
        //Дз 2, Задача 2
        System.out.println("Задача 2");
        int deposit2 = 15000;
        int total2 = 0;
        int month2 = 1;
        while (total2 < 12_000_000) {
            month2++;
            total2 = total2 + total2 * 7 / 100;
            total2 = total2 + deposit2;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма накоплений равна " + total2 + " рублей");
            }
        }
        //Дз 2, Задача 3
        System.out.println("Задача 3");
        int deposit3 = 15000;
        int total3 = 0;
        for (int month3 = 1; month3 <= 9 * 12; month3++) {
            total3 = total3 + total3 * 7 / 100;
            total3 = total3 + deposit3;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма накоплений равна " + total3 + " рублей");
            }
        }
        //Дз 2, Задача 4
        System.out.println("Задача 4");
        //int firstFriday = 5;
        int day = 5;
        while (day < 31) {
            day = day + 7;
            if (day <= 31) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчёт.");
            }
        }
        //Дз 3, Задача 1
        System.out.println("Задача 1");
        int years = 0;
        while (years < 2022) {
            years = years + 79;
            if (years >= 1822 || years > 2022) {
                System.out.println(years);
            }
        }
        //Дз 3, Задача 2
        System.out.println("Задача 2");
        int n = 1;
        int result = 1;
        while (n < 10) {
            n++;
            result = n * 2;
            System.out.println("2*" + n + "=" + result);
        }





    }
}