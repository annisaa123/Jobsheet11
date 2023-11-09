import java.util.Scanner;
public class KasusFix04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        System.out.print("Input nilai bintang: ");
        int tinggi = sc04.nextInt(); 

        for (int i = 1; i <= tinggi; i++) {
            // Loop pertama untuk membuat spasi sebelum bintang
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }

            // Loop kedua untuk mencetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Pindah ke baris baru setelah setiap baris selesai
            System.out.println();
        }
    }
}