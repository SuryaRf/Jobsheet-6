import java.util.Scanner;

public class Pemilihan2Percobaan327 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukan kategori");
        kategori = input27.nextLine();
        System.out.println("Masukan Besarnya Penghasilan");
        penghasilan = input27.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan >= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));

            System.out.println("Penghasilan Bersih : " + gajiBersih);

        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }

            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } else {
            System.out.println("Masukan kategori salah");
        }

    }
}