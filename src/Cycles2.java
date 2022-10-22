public class Cycles2 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int sum = 15000;
        int monthNum = 1;
        while (sum <= 12_000_000) {
            sum *= 1.07;
            System.out.printf("Месяц %d, сумма %d \n", monthNum, sum);
            monthNum++;
        }

        System.out.println("Задание 2");
        {
            while (sum <= 12_000_000) {
                sum *= 1.07;
                if (monthNum % 6 == 0) {
                    System.out.printf("Месяц %d, сумма %d \n", monthNum, sum);
                }
                monthNum++;
            }

                System.out.println("Задание 3");
                for (int i = 1; i < 9 * 12; i += 6) {
                    int sumBefor = sum;
                    sum *= 1 + 0.07 * 6;
                    System.out.printf("Месяц %d, сумма %d \n", i, sum - sumBefor);
                }
            }

            System.out.println("Задание 4");
            int firstFriday = 3;
            for (int currentFriday = firstFriday; currentFriday<=31; currentFriday +=7){
                System.out.println("Сегодня пятница, " + currentFriday+ "-ое число. " + "Необходимо подготовит отчёт.");
            }
        }
    }
