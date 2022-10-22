public class Cycles {
    public static void main(String[] args) {

            System.out.println("Задание 1");
            int monthNumber = 1;

            for(int sum = 0; sum < 2459000; ++monthNumber) {
                sum += 15000;
                System.out.printf("Месяц %d , сумма накоплений равна %d рублей \n", monthNumber, sum);
            }

            System.out.println("Задание 2");
            int x = 1;

            while(x <= 10) {
                int var10001 = x++;
                System.out.print("" + var10001 + " ");
            }

            System.out.println();

            int population;
            for(population = 10; population >= 1; --population) {
                System.out.print("" + population + " ");
            }

            System.out.println();
            System.out.println("Задание 3");
            population = 12000000;
            int brithRate = 17 * population / 1000;
            int deathRate = 8 * population / 1000;

            for(int i = 1; i <= 10; ++i) {
                population += brithRate;
                population -= deathRate;
                System.out.printf("Год %d, численность %d /n", i, population);
            }
    }
}