import java.util.Scanner;

public class Main {

public static boolean finish = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество потоков: ");
        int threadColl = 0;
        if(sc.hasNextInt()) {
            threadColl = sc.nextInt();
        }

        new Thread(new Adding()).start();

        for (int i = 0; i < threadColl; i++) {
            new Thread(new Handler()).start();
        }
        if(sc.hasNext()) {
            finish = true;
        }
    }
}