public class Cycles3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int currentYear = 2022;
        int beginnin = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = beginnin; i < ending; ++i){
            if (i % 79 == 0){
                System.out.println(i);
            }
        }

        System.out.println("Задание 2");
        for (int i = 1; i < 10; ++i) {
            System.out.println("2*" +i+ "= " + 2 * i);
        }
    }
}