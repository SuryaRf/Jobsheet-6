import java.util.Scanner;

public class Suhu27 {
    public static void main(String[] args) {
        int suhu;
        char hujan;
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa suhu sekarang? ");
        suhu = sc.nextInt();
        if (suhu > 27) {
            System.out.println("Memakai dress");
            System.out.print("Apakah sekarang hujan (y atau t)? ");
            hujan = sc.next().charAt(0);
            if (hujan == 'y') {
                System.out.println("Membawa payung");
            } else {
                System.out.println("Memakai sunscreen");
            }
        } else {
            System.out.println("Memakai celana panjang");
        }

    }
}
