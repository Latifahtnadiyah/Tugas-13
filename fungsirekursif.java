import java.util.Scanner;

public class Tugas {
    private static int faktorial(int a){
        if (a == 1) {
            return a;
        } else {
            return a*faktorial(a-1);
        }
    }

    private static int pangkat(int x, int y){
        if (y == 0) {
            return 1;
        } else {
            return x * pangkat(x, y-1);
        }
    }

    private static int fibonacci(int n){
        if (n == 0||n == 1){
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n-2);
        }
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan: ");
        int bil = input.nextInt();
        System.out.println(bil + "! = " + faktorial(bil));
        
        System.out.print("Masukkan Nilai X: ");
        int x = input.nextInt();
        System.out.print("Masukkan Nilai Y: ");
        int y = input.nextInt();
        System.out.println(x + " dipangkatkan " + y + " = " + pangkat(x,y));

        System.out.print("Masukkan Batas Deret Bilangan Fibonacci: ");
        int batas = input.nextInt();
        System.out.print("Deret Fibonacci: ");
        for (int i = 0; i < batas; i++){
            System.out.print(fibonacci(i) + ", ");
        }
        System.out.println();   
    }
}