import java.util.Scanner;
/**
 * Square04_1
 */
public class Square04_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N=");
        int N = sc.nextInt();
        
        for (int iOuter=0; iOuter<=N; iOuter++){ //Inisialisasi iOuter = 1 diubah menjadi iOuter = 0
            for(int i=1; i<=N; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}